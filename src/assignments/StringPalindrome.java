package assignments;

import java.util.Iterator;
import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		
		String str, rev="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your string");
		str = sc.nextLine();
		int length = str.length();
		System.out.println(length);
		for(int i =length-1;i>=0;i--)
			rev = rev+str.charAt(i);
			if(rev.equals(str))
			{
				System.out.println("Given string is palindrome");
			}
			else
			{
				System.out.println("Given string is not palindrome");
			}
			
			String environment = "QA";
			switch (environment)
			{
			case "QA":
				System.out.println("Please pass the correct environment");
				break;
			
			case "Dev":
				System.out.println("Please pass the Dev environemnt");
				break;
				
			case "Pre-Prod":
				System.out.println("Please pass the Pre prod environment");
				break;
			}
			
	}

}
