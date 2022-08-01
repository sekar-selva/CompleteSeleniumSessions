package encapsulation;

public class Test1 {
	
	public void accessWifi()
	{
		System.out.println("Accessing the wifi you have to access the pwd");
		System.out.println("permission granted to access the pwd from pwd metod");
		accessWifiWOPWD();
		pwd();
		dns();
	}
	
	private void accessWifiWOPWD()
	{
		System.out.println("Access the wifi without pwd");
	}
	private void dns()
	{
		System.out.println("Getting the dns info");
	}

	private void pwd()
	{
		System.out.println("the wifi is accessed without pwd:");
	}
	
}
