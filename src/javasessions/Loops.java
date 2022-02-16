package javasessions;

public class Loops {

	public static void main(String[] args) {
		
		
		/* Loops - In java there 3 loops available.
		 * 1. while  
		 *  2. for - loop
		 * 3. do- while
		 */
		
		
		//1. While loop: 
		
		int j= 1; // Initialization
		while(j<=10) // After initializing, it will check the condition, if the condition is pass, then it will goes inside the loop otherwise it will exit from the loop and terminate
		{
			System.out.println(j);
			j++;
		
		}
		System.out.println("Fail");
		
		
		//2. For loop
		
		for(char a = 'A'; a<='Z';a++ )
		{
			System.out.println(a);
		}
	}

}
