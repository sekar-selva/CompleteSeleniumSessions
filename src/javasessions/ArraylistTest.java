package javasessions;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraylistTest {
	
	
	public ArrayList<Object> studentDb(String stdName)
	{
		System.out.println("The name of the student is:"+stdName);
		ArrayList<Object> stdlist = new ArrayList<Object>();
		{
			switch (stdName.toLowerCase()) {
			case "sekar":
				stdlist.add("67");
				stdlist.add("78");
				stdlist.add("98");
				stdlist.add("95");
				break;
			case "pavi":
				stdlist.add("77");
				stdlist.add("71");
				stdlist.add("98");
				stdlist.add("94");
				break;
			case "ramya":
				stdlist.add("67");
				stdlist.add("45");
				stdlist.add("92");
				stdlist.add("98");
				break;
			default:
			{
				System.out.println("Student name not found in DB:"+stdName);
				break;
			}
			}
		}
		return stdlist;
		
	}

	public static void main(String[] args) {
		ArraylistTest at = new ArraylistTest();
		ArrayList<Object> list =at.studentDb("sekar");
		System.out.println(list);
		
		System.out.println("Using for loop to print the arrayList");
		for (int i = list.size()-1; i >=0; i--) {
			System.out.println(list.get(i));
			
		}
		System.err.println("Using for each loop");
		for (Object stdlist : list) {
			System.out.println(stdlist);
		}
		

	}

}
