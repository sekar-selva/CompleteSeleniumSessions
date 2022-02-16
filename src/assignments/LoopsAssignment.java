package assignments;

public class LoopsAssignment {

	public static void main(String[] args) {
		
		
		// 1. USING FOR LOOP
		
		System.out.println("                   Print 10 to 1 program using for loop          ");
		
		for(int a = 10; a>=1; a--)
		{
			System.out.println(a);
		}
		
		
		// 2 . USING WHILE LOOP
		System.out.println("                   Print 10 to 1 program using while loop         ");
		int b =10;
		while(b>=1)
		{
			System.out.println(b);
			b--;
		}
		
		// 2 . USING DO-WHILE LOOP
				System.out.println("                   Print 10 to 1 program using do -while loop         ");
				
				int c =10;
				do
				{
					System.out.println(c);
					c--;
				}
				while(c>=1);
}
}
