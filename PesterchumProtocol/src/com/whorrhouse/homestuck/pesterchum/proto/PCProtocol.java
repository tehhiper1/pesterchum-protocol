package com.whorrhouse.homestuck.pesterchum.proto;

import java.io.Serializable;

/**
 * Class PCProtocol contains at least one out of three objects. This object is serialized and sent between client and server.
 * @author tehhiper1
 * @see Account
 * @see User
 * @see Message
 * @version 1.0.1
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
	
	/**
	 * The default constructor for a PCProtocol does nothing.
	 */
	public PCProtocol()
	{
		
	}
	/**
	 * When constructed with an Account object, the constructor saves the object and sets itself to have an Account object.
	 * @param anAccount A specified Account object to be added to the protocol.
	 */
	public PCProtocol(Account anAccount)
	{
		this.anAccount = anAccount;
		toggleAccount();
		
	}
	/**
	 * When constructed with a User object, the constructor saves the object and sets itself to have a User object.
	 * @param aUser A specified User object to be added to the protocol.
	 */
	public PCProtocol(User aUser)
	{
		this.aUser = aUser;
		toggleUser();
	}
	/**
	 * When constructed with a Message object, the constructor saves the object and sets itself to have a Message object.
	 * @param aMessage A specified Message object to be added to the protocol.
	 */
	public PCProtocol(Message aMessage)
	{
		this.aMessage = aMessage;
		toggleMessage();
	}
	/**
	 * Toggles whether or not this PCProtocol contains an Account object.
	 */
	private void toggleAccount()
	{
		m_Account = !m_Account;
	}
	/**
	 * Toggles whether or not this PCProtocol contains a User object.
	 */
	private void toggleUser()
	{
		m_User = !m_User;
	}
	/**
	 * Toggles whether or not this PCProtocol contains a Message object.
	 */
	private void toggleMessage()
	{
		m_Message = !m_Message;
	}
	/**
	 * Checks if this PCProtocol contains a Message object.
	 * @return <b>true</b> if this PCProtocol contains a Message object.
	 * <br><b>false</b> if it does not.
	 */
	public boolean hasMessage()
	{
		if(m_Message)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	/**
	 * Checks if this PCProtocol contains a User object.
	 * @return <b>true</b> if this PCProtocol contains a User object.
	 * <br><b>false</b> if it does not.
	 */
	public boolean hasUser()
	{
		if(m_User)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	/**
	 * Checks if this PCProtocol contains a Account object.
	 * @return <b>true</b> if this PCProtocol contains a Account object.
	 * <br><b>false</b> if it does not.
	 */
	public boolean hasAccount()
	{
		if(m_Account)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	/**
	 * When called, returns the stored Account object.
	 * @return An Account object.
	 */
	public Account getAccount()
	{
		return anAccount;
	}
	/**
	 * When called, returns the stored Message object.
	 * @return A Message object.
	 */
	public Message getMessage()
	{
		return aMessage;
	}
	/**
	 * When called, returns the stored User object.
	 * @return A User object.
	 */
	public User getUser()
	{
		return aUser;
	}
	
	
	
}
