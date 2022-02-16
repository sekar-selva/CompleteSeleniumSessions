package Practice;

public class OddEvenNum {
	public static void main(String[] args) {

		/*
		 * for (int num = 1; num <= 20; num = num + 2) { System.out.println(num); }
		 */

		for (int odd = 1; odd <= 15; odd++) {
			if (odd % 2 == 1)
				System.out.println("The odd number is:" + odd);
		}
		// num%2 = 0----> even
		// num %2 =1 --->odd
		System.out.println("********************");
		for (int even = 1; even <= 15; even++) {
			if (even % 2 == 0)
				System.out.println("The even nuember is :" + even);
		}
	}

}
