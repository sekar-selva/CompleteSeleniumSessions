package javasessions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ReverseArrayList {

	public static void main(String[] args) {
		
	List<Object> ral = Arrays.asList("Sekar", "Ram", "Pavi", "English");
	System.out.println("Size of thre array list is:"+ral.size());
	System.out.println(ral);
	for(int i=ral.size()-1; i>0;i--)
	{
		System.out.println(i);
	}

	Collections.sort(ral, Collections.reverseOrder());
	System.out.println(ral);
	}

}
