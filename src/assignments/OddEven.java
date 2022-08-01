package assignments;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
	
		 
		 Scanner scan =new Scanner(System.in);
		 System.out.println("Enter the Number :");
		 int num = scan.nextInt();
			for (int i = 1; i<=num;i++)
				if (i%2==1) {
					System.out.println("The even  number  is :" +i);
				}
			
		int j=0;
		while(j<=5)
		{
			System.out.println("j is:"+j);
			j++;
		}
		
		/*
		 * for(;;) { System.out.println("Hello"); }
		 */
		
		for(char d = 'a'; d<='z';d++)
		{
			System.out.println(d+":"+(int)d);
		}

	}

}
