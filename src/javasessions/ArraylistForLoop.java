package javasessions;

import java.util.ArrayList;



public class ArraylistForLoop {
	
	public ArrayList<String> ecomCompany (String ecomName)
	{
		System.out.println("E commerce company name:"+ecomName);
		ArrayList<String> companyLst = new ArrayList<String>();
		switch (ecomName.toLowerCase()) {
		case "myntra":
			companyLst.add("Roadster");
			companyLst.add("Fila");
			companyLst.add("Nike");
			break;
		case "amazon":
			companyLst.add("Mac book");
			companyLst.add("MacBook Pro");
			companyLst.add("Iphone 13");
			break;		
	    case "flipkart":
			companyLst.add("Samsung");
			companyLst.add("MI");
			companyLst.add("Sony");
		}
		return companyLst;
	}
	public static void main(String[] args) {
		ArraylistForLoop afl = new ArraylistForLoop();
		ArrayList<String> complist=afl.ecomCompany("amazon");
		for (String latestList : complist) {
			System.out.println(latestList);
			
		}
		for (int i = complist.size()-1; i>=0; i--) {
			System.out.println();
		}

	}

}
