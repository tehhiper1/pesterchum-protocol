package com.whorrhouse.homestuck.pesterchum.proto;

import java.util.Calendar;

/**
 * Class AccountAction contains information about bans and locks tied to a specific account.
 * <pre>
 * 	AccountAction a = new AccountAction();
 * </pre>
 * @author tehhiper1
 * @version 1.0.1
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
	/**
	 * Checks the ban status of this Account.
	 * @return <b>true</b> if the account is banned<br><b>false</b> if it is not banned
	 */
	public boolean getBanStatus()
	{
		return isBanned;
	}
	/**
	 * Reverses the ban status value.
	 */
	private void toggleBanStatus()
	{
		isBanned = !isBanned;
	}
	/**
	 * Checks the if this Account is locked or not.
	 * @return <b>true</b> if the account is locked<br><b>false</b> if it is not locked
	 */
	public boolean getLockStatus()
	{
		return isLocked;
	}
	/**
	 * Reverses the lock status value.
	 */
	private void toggleLockStatus()
	{
		isLocked = !isLocked;
	}
	/**
	 * Flags the account as being banned.
	 * @param reason Why the user was banned.
	 * @param duration How long after the current date the user will be banned for.
	 * @return <b>true</b> if setting the ban was successful<br><b>false</b> if setting the ban was unsuccessful
	 */
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
	/**
	 * Public method to set the lock status.
	 * @return <b>true</b> if the lock was set<br><b>false</b> if the lock failed to set
	 */
	public boolean setLock()
	{
		if(!isLocked)
		{
			toggleLockStatus();
			return true;
		}
		else
		{
			return false;
		}
	}
	/**
	 * Public method to clear the lock status.
	 * @return <b>true</b> if the lock was cleared<br><b>false</b> if the lock failed to clear
	 */
	public boolean clearLock()
	{
		if(isLocked)
		{
			toggleLockStatus();
			return true;
		}
		else
		{
			return false;
		}
	}
	/**
	 * Public method to clear ban status
	 * @return <b>true</b> if the ban was cleared<br><b>false</b> if the ban failed to clear
	 */
	public boolean clearBan()
	{
		if(isBanned)
		{
			toggleBanStatus();
			banDate = null;
			banEnds = null;
			customBanReason = null;
			return true;
		}
		else
		{
			return false;
		}
	}
}
