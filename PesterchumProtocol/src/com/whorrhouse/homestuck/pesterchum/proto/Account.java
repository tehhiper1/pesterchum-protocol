package com.whorrhouse.homestuck.pesterchum.proto;

import java.util.ArrayList;

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
