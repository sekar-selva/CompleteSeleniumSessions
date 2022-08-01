package javasessions;

public class IfesleStatements {

	public static void main(String[] args) {
		
		
		
		String browser = "Edge";
		if(browser.equals("chrome"))
		{
			System.out.println("Launch chrome");
		}
		else if (browser.equals("Opera")) {
			System.out.println("Launch Opera");	
		}
		else if (browser.equals("ff")) {
			System.out.println("Lauch FF");
		}
		else if (browser.equals("IE"))
		{
			System.out.println("Launch IE");
		}		
		else if(browser.equals("safari"))
		{
			System.out.println("Launch the safari browser");
		}
		else {
			System.out.println("Please pass the correct browser");
		}

	}

}
