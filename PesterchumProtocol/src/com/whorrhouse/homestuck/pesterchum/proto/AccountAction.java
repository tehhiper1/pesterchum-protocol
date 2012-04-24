package com.whorrhouse.homestuck.pesterchum.proto;

import java.util.Calendar;

/**
 * Class AccountAction contains information about bans and locks tied to a specific account.
 * <pre>
 * 	AccountAction a = new AccountAction();
 * </pre>
 * @author tehhiper1
 * @version 1.0
 *
 */
public class AccountAction
{
	private boolean isBanned;
	private boolean isLocked;
	private Calendar lockDate;
	private Calendar banDate;
	private int banDuration;
	private Calendar banEnds;
	private String customBanReason;
	private String bannedFromIPAddress;
	private String lockedFromIPAddress;
	public AccountAction()
	{
		
	}
	public boolean getBanStatus()
	{
		return isBanned;
	}
	private void toggleBanStatus()
	{
		isBanned = !isBanned;
	}
	public boolean getLockStatus()
	{
		return isLocked;
	}
	private void toggleLockStatus()
	{
		isLocked = !isLocked;
	}
	public boolean setBan(String reason, int duration)
	{
		toggleBanStatus();
		banDate = Calendar.getInstance();
		banEnds = banDate;
		banEnds.add(Calendar.DATE, duration);
		if(duration == -1)
		{
			banEnds.set(2199,12 ,31);
			customBanReason = "You have been permanently banned from Pesterchum. Contact an admin to dispute.";
		}
		if(reason == null && duration != -1)
		{
			customBanReason = "You have been banned from Pesterchum until "+banEnds+".";
		}
		else
		{
			customBanReason = "You have been banned from Pesterchum for the following reason: " +reason +"Your ban was filed on "+banDate+"\nYour ban expires on"+banEnds;
		}
		return true;
		
	}
	public boolean setLock()
	{
		toggleLockStatus();
		return true;
	}
	
}
