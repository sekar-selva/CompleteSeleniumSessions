package javasessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraylistconcept {

	public static void main(String[] args) {
		ArrayList al = new ArrayList(5);
		//System.out.println((al.size()));
		al.add(10); // it is used to store the data in the array list
		al.add(15);
		al.add(7);
		al.add(8);
		al.add(19);
		al.add(25);
		al.add(35);
		al.add(8);
		System.out.println("Size is:" +al.size());
		System.out.println(al);
		System.out.println(al.get(7));
		
		System.out.println("---------");
		int a1[]={1,2,3,4};
		System.out.println(a1.length);
		for(int e : a1) // here i am assigning one variable to c and all the values will be assigined here
		{
		System.out.println(a1);
		}
		System.out.println("The size of the array list is:" +al.size()); 
		// for static array we have to use length method, if it is non-static method then we have to use method
		System.out.println(al); // to print the arraylist
		System.out.println((al.get(0))); // get is used to get the index of the particular array list
		for(int j=0;j<al.size();j++)  // for printing the values in the array list or we can use arraylist reference variable
		{
			System.out.println(al.get(j));
		}
		
		System.out.println("-------Integer ArrayList---------");
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(0, 15);
		al1.add(1, 20);
		al1.add(2, 25);
		System.out.println(al1.size());
		System.out.println(al1);
		System.out.println("----------");
		al1.addAll(al); // for adding two array list
		System.out.println(al1);

		System.out.println("-------String ArrayList---------");
		
		ArrayList<String> arrStr = new ArrayList<String>();
		arrStr.add(0, "S");
		arrStr.add(1, "E");
		arrStr.add(2, "K");
		arrStr.add(3, "A");
		arrStr.add(4, "R");
		
		System.out.println(arrStr);
		
		System.out.println("-------2nd String ArrayList---------");		
		ArrayList<String> arrStr1 = new ArrayList<String>();
		arrStr1.add(0, "S");
		arrStr1.add(1, "E");
		arrStr1.add(2, "L");
		arrStr1.add(3, "V");
		arrStr1.add(4, "A");
		arrStr1.addAll(arrStr);
		System.out.println(arrStr1);
		
		System.out.println("-------String List---------");	
		List<String> names = Arrays.asList("S","E", "K", "A", "R");
		System.out.println(names);
		System.out.println("------- Object ArrayList --------");
		ArrayList<Object> proddetails = new ArrayList<Object>();
		proddetails.add(0, 101);
		proddetails.add(1, "Colgate");
		proddetails.add(2, 57.5);
		proddetails.add(3, 'N');
		proddetails.add(4, true);
		
		for(int i=0; i<proddetails.size();i++)
		{
			System.out.println(proddetails.get(i));
		}
		
		for(Object prod :proddetails)
		{
			System.out.println(prod);
			if(prod.equals('N'))
					{
				System.out.println("Mentioned proudct is 100% Natural");
					}
		}
		ArrayList<Integer> nums=new ArrayList<Integer>(4);
		nums.add(0, 15);
		nums.add(3, 60);
		for(Integer e:nums)
		{
		System.out.println(e);
		}
	}

}
