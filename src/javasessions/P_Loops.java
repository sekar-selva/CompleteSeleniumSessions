package javasessions;

import java.nio.file.attribute.AclEntry;
import java.util.Scanner;

public class P_Loops {

	public static void main(String[] args) {
		
		
		// while loop
		int q =1;
		while (q<=10)
		{
			System.out.println("value is:"+q);
			q++;
		}
		
		// for printing the ascii values of alphabets
		for(char c = 'a'; c<='z';c++)
		{
			System.out.println(c+":"+(int) c);
		}
		double d = 9.78;
		System.out.println("------------"+d);
		float m =(float) d;
		System.out.println("---------------------------"+m);
		// for printing the odd number from 1 to 10
		for(int odd =0; odd<=15; odd =odd+2)
		{
			System.out.println(odd);
		}
		
		String str, rev="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string");
		str = sc.nextLine();
		int length = str.length();
		System.out.println(length);
		for(int i=length-1; i>=0;i--)
		rev = rev +str.charAt(i);
		if(rev.equals(str))
		{
			System.out.println("given string is palindrome");
		}
		else
			System.out.println("Given string is not an palindrome");
	}


			
}

	

