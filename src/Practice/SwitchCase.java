package Practice;

public class SwitchCase {

	public static void main(String[] args) {
		
		
		String name = "sekar";
		switch (name) {
		case "Sekar":
			System.out.println("Student is not present");
			break;
		case "Naveen":
			System.out.println("Student is not present");
			break;

		default:
			System.out.println("Plase provide the correct student details as :" + name);
			break;
		}
		 
			
			
			String Browser = "Ie     ";
			switch (Browser.toLowerCase().replace(" ", "")) {
			case "chrome":
				System.out.println("Launch chrome" );
				break;
			case "ie":
				System.out.println("Launch IE");
				break;
			case "opera":
				System.out.println("Launch opera");
				break;
			case "Firefox":
				System.out.println("Launch Firefox");
				break;

			default:
				System.out.println("Please pass the correct browser");
				break;
			}
			System.out.println("--------------Environment-------------------");
			String Env ="Qa EnvironMent";
			switch (Env.toLowerCase().replace(" ", "")) // qaenvironment
			//System.out.println("Env");
			{
			case "qaenvironment":
			System.out.println("into QA env url");
				break;
			case "DevEnvironment":
				System.out.println("into the Dev env url");
				break;
			case "PreProdEnvironment":
				System.out.println("into the  pre prod env url");
				break;
			default:
				System.out.println("Please pass the correct env url");
				break;
			}
	}

}
