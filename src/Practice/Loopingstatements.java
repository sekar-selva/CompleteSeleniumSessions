package Practice;

public class Loopingstatements {

	public static void main(String[] args) {
		
		//while 
		int i= 0;
		while (i<=10)
		{
			System.out.println("The value of i is:"+i); // i= 1,
			i= i+1;
		}
		
		// infinite loop
		
		/*
		 * int j= 1; while (j<=5) {
		 * System.out.println("Hello, Welcome to the Indian Investor group"); // for
		 * infinite loop }
		 */
		
		boolean flag = true;
		int num =1;
		while(flag)
		{
			System.out.println("Welcome the Automation training");
			num++;
			if(num==5)
			{
				System.out.println("You came to into inside the another condition");
				break;
			}
		}
		for(int x = 0;x<=7;x++)
		{
			System.out.println(x); //
		}
		System.out.println("---------->Another format for the ForLoop <-----------------");		
		int j= 1;
		for(;j<=12; j++)
		{
			System.out.println(j); // this is also correct
		}
		System.out.println("---------->Another format for the ForLoop <-----------------");
		int f = 5;
		for(;f<=15;)
		{
			System.out.println(f); // this format also allowed but moslty we use first one
			f++;
			
		}
		/*
		 * System.out.
		 * println("---------->Another format for the infinete ForLoop <-----------------"
		 * ); for(;;) { System.out.println("hello"); }
		 */
		
		// can we write double, char in the for loop....? , yes of course we can write and lets see how to write
		
		for(double t= 1.7; t<=15.5;t++)
		{
			System.out.println(t);
		}
		System.out.println("Equavalent to Integers");
		for(char v = 'a'; v<='z';v++)
		{
			System.out.println((int)v);
		}
		System.out.println("Equavalent to Chars");
		for(char v = 'a'; v<='z';v++)
		{
			System.out.println("value of " + v +" Equivalent's to: "+(int)v);
		}
		
		System.out.println("Caps A to Z");
		for(char v = 'A'; v<='Z';v++)
		{
			System.out.println((int)v);
		}
		
		for(char v = 'a'; v<='z';v++)
		{
			System.out.println(v);
		}
		for(char v = 'A'; v<='Z';v++)
		{
			System.out.println(v);
		}
	}

}
