package javasessions;

public class Stringconcate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s = "a";
		String t = "b";
		System.out.println(s+t);
		
		String a = "Hello";
		String b = "World";
		System.out.println(a + b);
		
		System.out.println(0/9); //0
		//System.out.println(9/0); // Arithmetic exception
		System.out.println(1/9);
		System.out.println(9.0/3); //3.0
		System.out.println(9/3.0); //3.0
		System.out.println(9/3.00); //3.0
		System.out.println(0.0/9); //0.0
		System.out.println(0.0/0.0); //Not a Number
		System.out.println(9/0.0); // infinity
		System.out.println(9.0/0.0);
		System.out.println(0/9.0);
	}

}
