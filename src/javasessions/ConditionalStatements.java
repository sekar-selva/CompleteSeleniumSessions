package javasessions;

public class ConditionalStatements {

	public static void main(String[] args) {
		
		String s ="Hello";
		String t = "World";
		
		System.out.println(s + t);
		
		String a = "Hello";
		String b ="Hello1";
		if(a==b)  // this is not recomended, because string comparison only should happen with the predefined methods in java . i.e a.equals like that
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		String x = "welcome ";
		String y = "WELCOME";
		/*
		 * if(x.equals(y)) { System.out.println("String comparison pass"); } else {
		 * System.out.println("String comparison fails"); }
		 */
		if(x.trim().equalsIgnoreCase(y))
		{
			System.out.println("case ignored");
		}
		else
		{
			System.out.println("case is not ignored");
		}
	}

}
