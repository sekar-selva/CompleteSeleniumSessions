package assignments;

import java.util.Arrays;

public class MaxNumber {

	public static void main(String[] args) {
		
		int a[] = {1,5,7,8,9,11,15,12,17,0};
		Arrays.sort(a);
			System.out.println("Sorted array is:"+Arrays.toString(a));
			//System.out.println(b);
		System.out.println("Size of the array is:" +a.length);
		int result = a[a.length-1];
		System.out.println("Max NUmber is:"+result);
		
		

	}

}
