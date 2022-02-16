package javasessions;

import java.util.Arrays;

public class LoopsAssignment {

	public static void main(String[] args) {
		// can you print A-Z, a-z, 0-9 in the console using for loop...?
		
		
		System.out.println("***************");
		int x[]= new int [4];
		x[0]= 5;
		x[1]=6;
		x[2]=7;
		x[3]=8;
		System.out.println("The length of the array is :" +x.length);
		
		
		
		System.out.println("***************");
		System.out.println("Printing number from 0-10");
		for(int i =0; i<=10; i++) //here after printing i, it will increase the i value
		{
			System.out.println(i);
			 
		}
		
		System.out.println("--------------------");
		
		System.out.println("Printing character from a-z");
		for(char b = 'a'; b<='z'; b++)
		{
			System.out.println(b);
		}
		
		System.out.println("--------------------");
		
		System.out.println("Printing character from A-Z");
		
		for(char c = 'A'; c<='Z'; c++)
		{
			System.out.println(c);
		}
		System.out.println("-------------------------------");
		System.out.println("Print the ASCII vlaues equivalent to the numerics");
		
		for(char i = 'a'; i<='z'; i++)
		{
			System.out.println(i + ":" + (int)i);
		}
		
		System.out.println("---------------------------------------");
		System.out.println("Print odd numbers");
		for(int num =1; num<=9; num= num+2)
		{
			System.out.println(num);
		}
		
	
		
	}

}
