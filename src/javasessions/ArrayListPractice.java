package javasessions;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListPractice {

	public static void main(String[] args) {
		
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		System.out.println(al);
		System.out.println(al.size());
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		ArrayList<Integer> al1= new ArrayList<Integer>(5);
		al1.add(45);
		al1.add(55);
		al1.addAll(al);
		System.out.println(al1);
		
		ArrayList<String> prodList1 = new ArrayList<String>();
		prodList1.add("carrot");
		prodList1.add("beetroot");
		prodList1.add("Cabbage");
		System.out.println(prodList1);
		Collections.sort(prodList1);
		System.out.println(prodList1);
		int prodListSize = prodList1.size();
		System.out.println(prodListSize);
		System.out.println("------------------");
		for(int i=prodListSize-1; i>=0; i--)
			//for(int i = nameListSize-1;i>=0;i--)
		{
			System.out.println(prodList1.get(i));
		}
		
		
	}

}
