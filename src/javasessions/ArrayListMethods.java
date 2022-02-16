package javasessions;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {
		
		ArrayList<String> userData = new ArrayList<String>();
		userData.add(0, "Sekar");
		userData.add(1, "Arun");
		userData.add(2, "Visak");
		userData.add(3, "Elon");
		System.out.println(userData);
		Collections.sort(userData);
		System.out.println(userData);
		Collections.sort(userData,Collections.reverseOrder());
		System.out.println(userData);
		

		
		System.out.println("-----------Reverse the order using for loop---------");
		ArrayList<String> nameList = new ArrayList<String>();
		nameList.add("Mukesh"); //0
		nameList.add("Pradeep"); //1
		nameList.add("Sam"); //2
		nameList.add("Ajay"); //3
		
		int nameListSize = nameList.size();
		System.out.println(nameListSize);
		for(int i = nameListSize-1;i>=0;i--)
		{
		System.out.println(nameList.get(i));
		
		}
		
		nameList.addAll(userData); // using to  add 2 different array list
		System.out.println(nameList);
		
		 
		
		
	}

}
