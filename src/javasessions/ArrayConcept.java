package javasessions;

import java.util.Arrays;

public class ArrayConcept {

	public static void main(String[] args) {
		
		int x[]= new int[5];
		x[0]=11;
		x[1]=12;
		x[2]=13;
		x[3]=14;
		x[4]=15;
		//x[5]=16; // if we define x[5], then it will give you Array index out of bound exception ---AIOB, why because x[5] is not even exit in the memory and we declared only upto 0-4 (total =5 but not value 5) 
		//x[-1]= 17; // index is always positive and negative value or index is not allowed
		System.out.println("The array size is:"+ x.length);
		
		System.out.println(Arrays.toString(x));
		System.out.println("How to print all the array values..?"); // using for loop we can print all the values in the array
		for(int i=0; i<x.length;i++)
		{
			System.out.println("Array values are:" +x[i]);
		}
		
		for(int e:x)
		{
			System.out.println(e);  // both for loop and for-each loop are same but it is straight forward.. we have to assign x value to e and then print it as normally, that's it
		}
		System.out.println(x); // if you are directly printing array, then it will throw ascii values as o/p
		System.out.println(Arrays.toString(x));
	}

}
