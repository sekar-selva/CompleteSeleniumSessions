package stringManipulation;

public class StringManipPractice {

	public static void main(String[] args) {
		
		String s1 ="Welcome to the QA world";
		String s2 ="Welcome to the QA world";
		
		System.out.println(s1.indexOf('5')); // index of string is not applicable
		System.out.println(s1.charAt(5));
		System.out.println();
		int length = s1.length();
		System.out.println(length);
		System.out.println("Hellllllllllllllllooooooooooooooooooow");
		
		boolean b=(s1==s2);
		System.out.println(b);
		System.out.println(s1.indexOf('o', s1.indexOf('o')+1));
		System.out.println(s1.indexOf('z')); // if the string is not available then it will give -1
		String lc =s1.toLowerCase();
		System.out.println(lc);
		String uc =s1.toUpperCase();
		System.out.println(uc);
		//s1.indexOf('o',s1.indexOf('o')+1,s1.indexOf('o')+1); this method is allowed only index of int, int or int,string but 3 args are not allowed
		
		int seq2 = s1.indexOf('o',s1.indexOf('o')+1);
		System.out.println(seq2);
		int seq3 = s1.indexOf('o',seq2+1);
		System.out.println(seq3);
		
		
		
		// Why strings are Immutable...?
		
		String x = "Hey"; // if we write it like this, then it will be strored into the heap memory isside of string constant pool
		
		// if we create 
		
		String y = new String ("Hello there");
		// the obj will be created in side the heap and scp also so there will be duplication i.e, the string "Hello there" is refere by the ref var y and the same y = hello there will be present in the scp also becaue it is string
		
		
		String x1= "Hello"; // literal ==
		String x3= "Hello";
		String x2 = new String ("Hello");

		boolean b2 = x1.equals(x2);
		System.out.println("@@@@@@@@@@@@@@@");
		System.out.println(b2);
		boolean b3 = (x1==x2);
		System.out.println("^^^^^^^^^^^^^^^^");
		System.out.println(b3);
		boolean b4 = (x1==x3);
		System.out.println("**********");
		System.out.println(b4);
	}

}
