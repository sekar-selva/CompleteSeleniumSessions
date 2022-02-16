package assignments;

public class IfesleLogic {

	public static void main(String[] args) {
		
		// Here also having one problem , it will check each and every condtion then execute the correct condtion and anyway it will time consume
		String browser = "FF";
		if(browser.equals("chrome"))
		{
			System.out.println("Launch chrome");
		}
		else if (browser.equals("FF")) {
			System.out.println("Launch FF");
		}
		else if (browser.equals("Safari")) {
			System.out.println("Launch safari");
		}
		else
		{
			System.out.println("Please pass the right browser");
		}

	}	
	

}
