package javasessions;

public class MethodReturns {
	
	// Pass the browser and launch and make sure it is launched or not
	
	public  boolean launchBrowser(String brname)
	{
		if(brname.equals("chrome"))
		{
			System.out.println("Chrome is getting launched");
			return true;
		}
		else if(brname.equals("firefor"))
		{
			System.out.println("Firefox is getting lauched");
			return true;
		}
		else if(brname.equals("ie"))
		{
			System.out.println("ie is getting launched");
			return true;
		}
		else
		{
			System.out.println("Pass the correct browser: " +brname);
			return false;
		}
		
	}

	public static void main(String[] args) {
		MethodReturns mr = new MethodReturns();
		Boolean flag = mr.launchBrowser("opera");
		if(flag)
		{
			System.out.println("Test case passed");
		}
		else
		{
			System.out.println("Test case is failed");
		}
		
		

	}

}
