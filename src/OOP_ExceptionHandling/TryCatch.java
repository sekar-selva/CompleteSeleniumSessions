package OOP_ExceptionHandling;

import java.util.ArrayList;
import java.util.Arrays;

public class TryCatch {

	public static void main(String[] args) {
		
		System.out.println("Comes into the Try block");
		
		
		try {
			//int c= 10/0;
			/*
			 * ArrayList<Integer> al= new ArrayList<Integer>(); al.add(0,15); al.add(1, 3);
			 * al.add(2, 5); al.add(6,27); int size =al.size();
			 * System.out.println("Array list Size :"+size);
			 */
			int a[]= new int [5];
			a[10]= 5;
		} catch (ArithmeticException e) {
			System.out.println("Arithmetci Exception");
			e.printStackTrace();
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("AIOB is Coming");
			e.printStackTrace();
		}
		
		  catch (IndexOutOfBoundsException e) { System.out.println("IOB");
		  e.printStackTrace(); }
		 
		System.out.println("Hey");
		System.out.println("Hey");
		System.out.println("Hey");
		System.out.println("Hey");
	}
	}

