package com.whorrhouse.homestuck.pesterchum.proto;

import java.io.Serializable;

/**
 * Class PCProtocol contains at least one out of three objects. This object is serialized and sent between client and server.
 * @author tehhiper1
 * @see Account
 * @see User
 * @see Message
 *
 */
public class PCProtocol implements Serializable
{
	private Account anAccount;
	private User aUser;
	private Message aMessage;
	private boolean m_Account = false;
	private boolean m_User = false;
	private boolean m_Message = false;
	
	public PCProtocol()
	{
		
	}
	public PCProtocol(Account anAccount)
	{
		this.anAccount = anAccount;
		toggleAccount();
		
	}
	public PCProtocol(User aUser)
	{
		this.aUser = aUser;
		toggleUser();
	}
	public PCProtocol(Message aMessage)
	{
		this.aMessage = aMessage;
		toggleMessage();
	}
	private void toggleAccount()
	{
		m_Account = !m_Account;
	}
	private void toggleUser()
	{
		m_User = !m_User;
	}
	private void toggleMessage()
	{
		m_Message = !m_Message;
	}
	
}
