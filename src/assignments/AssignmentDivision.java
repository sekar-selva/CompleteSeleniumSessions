package assignments;

public class AssignmentDivision {

	public static void main(String[] args) {
		

		int j = 1;

		while (j <=7) // 7<=10 
			{ 
			int x = j/7; //1 %7
			System.out.println(x);
			if (x == 0) {
				System.out.println(j);
				j++;
			} 
			else 
			{
				System.out.println("It exceeds the multiple of 7, so terminating from the loop");
				break;
			}
		
	}
		
		

	}

}
