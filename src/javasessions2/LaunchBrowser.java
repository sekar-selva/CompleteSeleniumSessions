package javasessions2;

public class LaunchBrowser {

	
	public void browser()
	{
		System.out.println("Lauch browser");
		checkOsVersion();
		oScompatible();
		ramStatus();
	}
	
	private void checkOsVersion()
	{
		System.out.println("Checking os version");
	}

	private void oScompatible()
	{
		System.out.println("Check os compatible");
	}
	private void ramStatus()
	{
		System.out.println("Check ram status");
	}
}
