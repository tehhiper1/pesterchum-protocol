package com.whorrhouse.homestuck.pesterchum.proto;

import java.util.ArrayList;

/**
 * Class Account contains the information about a specific user account in Pesterchum.
 * <pre>
 * 	Account a = new Account();
 * </pre>
 * @author tehhiper1
 * 
 *
 */
public class Account
{
	private int MAX_HANDLES = 3;
	private String emailAddress;
	private String encryptedPW;
	private AccountAction a;
	private ArrayList<User> handles;
	private AccountSettings settings;
	public Account()
	{
		
	}
}
