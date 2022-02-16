package assignments;

public class WhileLoopAssignment {

	public static void main(String[] args) {
		
		
		
		  int i =1; 
		  while(i<=10) 
		  { 
			  System.out.println("Hello world"); i++; } 
		  // problem statement; print 1 to 10 and if multiple of 7 is encountered terminate the loop
		  
		  
			int k = 1;
			while (k <= 10) {
				System.out.println(k);
				k++;
			}
		  
		 
			
			for(int q=1; q<=10; q++)
			{
				double d  = q/7;
				if(d==1.0)
				{
					System.out.println("It  does not exceeds from the 7");
				}
				else
					System.out.println("It exceeds the value of 7");
				break;
				
			}
		
			/*
			 * int j = 1;
			 * 
			 * while (j < 10) // 1<=10 { int x = j%7; if (x == 0) { System.out.println(j);
			 * j++; } else { System.out.
			 * println("It exceeds the multiple of 7, so terminating from the loop"); }
			 */
			
		}
		
		
		/*
		 * for(int j =0; j<=20; j++) { System.out.println(j); if(j%7==0) { System.out.
		 * println("It exceeds the multiple of 7, so terminating from the loop"); break;
		 * } }
		 */

	}


