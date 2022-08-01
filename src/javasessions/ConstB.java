package javasessions;

import java.util.ArrayList;

public class ConstB {

	public static void main(String[] args) {
		ConstA test = new ConstA("Amazon");
		System.out.println(test.compName);
		ConstA test1 = new ConstA(100);
		System.out.println(test1.empCount);
		ArrayList<String> comList = new ArrayList<>();
		comList.add("Walmart");
		comList.add("Flipkart");
		comList.add("Facebook");
		//onstA(String compName, int empCount, int estYr, ArrayList<String> complist, int deptCount)
		ConstA test3 = new ConstA("Myntra", 3620, 19900, comList, 160);
		System.out.println(test3.compName+";"+test3.estYr+":"+test3.complist+":"+test3.deptCount);
	}

}
