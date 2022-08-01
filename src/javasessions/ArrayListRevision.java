package javasessions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.swing.text.html.parser.DTD;


public class ArrayListRevision {

	public static void main(String[] args) {
		
		
		int b [] = new int[6];
		b[3] = 10;
		b[5] = 5;
		b[0]= 17;
		b[1]  = 23;
		b[0]= 19;
		System.out.println(b.length);
		System.out.println(Arrays.toString(b));
		System.out.println("***************");
		for(int i = 0; i<b.length; i++)
		{
			System.out.println(b[i]);
		}
		
		
		ArrayList<String> als = new ArrayList<String>();
		
		als.add("sekar");
		als.add("Pavi");
		als.add("seki");
		als.add("Tamil");
		System.out.println("-----------------------------------------------");
		Collections.sort(als, Collections.reverseOrder());
		System.out.println("New order"+als);
		
		System.out.println("************************************************************");
		System.out.println(als.size());
		//System.out.println(als);
		//System.out.println(Arrays.toString(als)); // arraylist arrays.too string is not allowed
		Collections.sort(als);   // this will help you to sort the array list 
		System.out.println("After sorting :"+als);
		
		System.out.println(als);
		
		ArrayList al = new ArrayList(); // this is the raw array list we will be getting warnings, if we use this, to overcome this we have to use object aarray
		al.add("sekar");
		al.add(10);
		al.add(true);
		al.add(15.55);
		al.add("sekar");
		al.add(10);
		al.add(true);
		al.add(15.55);
		al.add("pavi");
		System.out.println(al.size());
		System.out.println(al);
		al.remove(3);
		al.remove(2);
		System.out.println("After removing:"+al);
		//Collections.sort(al);
		System.out.println(al);
		
		System.out.println("----------------------Object Array List--------------------");
		ArrayList<Object> obj = new ArrayList<Object>(); // this is the raw array list we will be getting warnings, if we use this, to overcome this we have to use object aarray
		obj.add("sekar");
		obj.add(10);
		obj.add(true);
		obj.add(15.55);
		obj.add("sekar");
		obj.add(10);
		obj.add(true);
		obj.add(15.55);
		obj.add("pavi");
		obj.add(7, "Shibu");
		obj.add("");
		System.out.println(obj.size());
		System.out.println(obj);
		obj.remove(3);
		obj.remove(2);
		System.out.println("After removing:"+obj.size());
		//Collections.sort(obj);
		System.out.println(obj);
		System.out.println("------------ For each loop --------------");
		for (Object list : obj) {
			System.out.println(list);
		}
		System.out.println("------------ For loop --------------");
		
		String s = "Hello"; //string literal
		String s1 = new String ("Hey"); // these both are same and this is string object
		System.out.println(s);
		System.out.println(s1);
		
		List<Object> details = Arrays.asList("sekar", "Selva", "Pavi");
		List<Object> dt = Arrays.asList("101", "sekar", "15.5");
		System.out.println(dt.size());
		System.out.println("<<<<<<<<<<<<<--------------------------->>>>>>>>>>>>>");
		System.out.println("New list:"+dt);
		System.out.println(">>>>>>>>>>>>>>----------------------<<<<<<<<<<<<<<<<<");
		System.out.println(details.size());
		System.out.println(details);
		
		
		int x[]={10,11,12,15};  // int literal
		int x1[] = new int[] {11,12,15,6,1,67,9}; // int obj
		System.out.println(x.length);
		System.out.println(Arrays.toString(x1));
		for(int e :x1)
		{
			System.out.println("List:"+e);
		}
		}
				String tittle = "Rakesh";
				String titl = new String ("Sekar");
				
				char c = 'X';
				char c1[] = new char[] {'a', 's'};
	}


