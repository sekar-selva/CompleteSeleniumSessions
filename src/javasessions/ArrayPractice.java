package javasessions;

import java.util.Arrays;

public class ArrayPractice {

	public static void main(String[] args) {
		
		int a[] = new int [6];
		a[0]=5;
		a[1]=3;
		a[2]=1;
		a[3]=4;
		a[4]=11;
		a[5]=12;
		
		System.out.println("the lenght is"+a.length);
		for(int x= 0; x<a.length;x++)
		{
			System.out.println(a[x]);
		}
			
	// print the array using for each loop
		for(int e:a)
		{
			System.out.println(e);
		}
		System.out.println("Using arrays.to String"+Arrays.toString(a));

	}

}
