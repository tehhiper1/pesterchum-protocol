package com.whorrhouse.homestuck.pesterchum.proto;

/**
 * Class AccountSettings contains information about what settings are toggled on and off for a particular account. These include whether or not the user elects to push its pesterlogs, quirks, and chumroll to the server. It also contains the last used theme that the user selected.
 * @see Account
 * @author tehhiper1
 * @version 1.0a
 */
public class AccountSettings
{
	private boolean pushLogsToServer;
	private boolean pushQuirksToServer;
	private boolean pushChumRollToServer;
	private int selectedTheme;
	public AccountSettings()
	{
		
	}
}
