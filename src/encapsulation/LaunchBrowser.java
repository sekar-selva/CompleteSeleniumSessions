package encapsulation;

public class LaunchBrowser {

	public void launchChrome()
	{
		System.out.println("Chorme is getting launched");
		checkBrowserVersion();
		checkBrowserCompatible();
		checkBrowserUpgraded();
	}
	
	private void checkBrowserVersion()
	{
		System.out.println("checkingBrowserVersion");
	}
	private void checkBrowserCompatible()
	{
		System.out.println("checkingBrowserCompatible");
	}
	private  void checkBrowserUpgraded()
	{
		System.out.println("checkingBrowserCompatible");
	}
	
}
