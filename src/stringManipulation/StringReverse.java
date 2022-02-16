package stringManipulation;

public class StringReverse {

	public static void main(String[] args) {
		String s = "Welcome to selenium learning";
		char ca[] = s.toCharArray();
		System.out.println(ca);
		
		int len = ca.length;
		System.out.println(len);
		for(int i =len-1;i>=0;i--)
			System.out.println(ca[i]);
	}
//Write a program in Java to print 1 to 10 using while loop but quit if multiple of 7 is encountered
}
