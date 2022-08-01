package javasessions;

import java.util.Iterator;

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
		
		int z = 5;
		  z +=5;
		  
		  switch(z){
		   
		    case 5: System.out.println("5");break;
		    case 10: System.out.println("10");break;
		    default: System.out.println("0");
	}
		  int a1 = 0;
			if(a1==1);{
			    System.out.println("Sun");
			}
			String name = "sekar";
			switch (name) {
			case "no":
				System.out.println("Hey there");
			
			case "sname":
				System.out.println("Hey there1");
		
			default:
				System.out.println("Not available");
				break;
			}
			
			
			for(char   h = 'a'; h <='z'; h++) // printing the char's
			{
				System.out.println((int)h); // converting the char to int
			}
			
			for(char w = 'A'; w<='Z'; w++)
			{
				System.out.println(w+":"+(int)w);
			}
			
			for(char i = 0; i<=9; i++)
			{
				System.out.println(i+":"+(int)i);
			}
	}

}
