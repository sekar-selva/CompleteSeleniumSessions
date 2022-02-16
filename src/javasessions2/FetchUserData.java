package javasessions2;

import java.util.ArrayList;

public class FetchUserData {

	public static void main(String[] args) {
		UserData ud1 = new UserData(101);
		System.out.println(ud1.empId);

		UserData ud2 = new UserData(102, "Ram");
		System.out.println(ud2.empId +"," + ud2.empName);
		
		UserData ud3 = new UserData(103, "Rahav", 45000);
		System.out.println(ud3.empId +"," + ud3.empName +"," +ud3.salary );
		
		ArrayList< String> swlist = new ArrayList<String>();
		swlist.add("RuPay");
		swlist.add("Visa");
		swlist.add("MasterCard");
		
		UserData ud4= new UserData(104, "Suresh", 50000, swlist);
		System.out.println(ud4.empId +","+ud4.empName+","+ud4.swipecard);
		
		
		
	}

}
