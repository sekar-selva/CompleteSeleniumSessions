package javasessions;

public class Switchcase {

	public static void main(String[] args) {
		
		
		int u = 5;
		int v = ++u;
		System.out.println(v); // 6
		System.out.println(u);//6
		
		
		int e = 3;
		int f = e--;
		System.out.println(e); //2
		System.out.println(f); //3
		
		
		
		String browser = "FF ";

		switch (browser.trim().toLowerCase().replace(" ", "")) {
		case "chrome":
			System.out.println("Launch chrome");
			break;
		case "ff":
			System.out.println("Launch ff");
			break;
		case "IE":
			System.out.println("Launch IE");
			break;
			
		default:
			System.out.println("Please pass the correct browser");
			break;
			
			
		
		}

	}

}
