package assignments;

import java.util.Scanner;

public class LoopsAssignment2 {
	public static void test()
	{
		for (int num = 100; num>=0;num = num -5 )
		{
			System.out.println(num);
		}
	}
	

	public static void main(String[] args) {
		test();
		String output = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string :");
		String st = sc.nextLine();
		int length = st.length();
		for(int i =0; i<length;i++)
		{
			if ("AEIOUaeiou".indexOf(st.charAt(i))==-1) {
				 output = output+st.charAt(i);	
			}
		}
		System.out.println("output string is:"+output);
		

	}

}
