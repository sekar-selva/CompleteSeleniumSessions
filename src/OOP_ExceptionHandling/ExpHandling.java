package OOP_ExceptionHandling;

import java.util.ArrayList;

public class ExpHandling {

	public static void main(String[] args) {
	
		System.out.println("A");
		System.out.println("AB");
		System.out.println("ABC");
		try {
			
			ArrayList<Object> al= new ArrayList<Object>(2);
			al.add(0,15);
			al.add(1, 3);
			al.add(2, "Sekar");
			int size =al.size();
			
			System.out.println(size);
			System.out.println("Hello");
			int c = 9/0; // the moment you will get the error, it will goes into the catch block and never execute after the error line but after catch it will execute the entire progrqam. thats why we are using try catch to handle the exception
			System.out.println(c);
			System.out.println("Hey");
			System.out.println("Hey There");
			System.out.println(al);
		} catch (ArithmeticException e) {
			System.out.println("A");
			e.printStackTrace();
		}
		System.out.println("Bye");


	}

}
