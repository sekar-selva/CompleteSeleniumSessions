package javasessions2;

import java.util.ArrayList;

public class UserData {
	
	int empId;
	String empName;
	int salary;
	ArrayList<String > swipecard;
	
	public UserData(int empId) {
		this.empId = empId;
	}

	public UserData(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}

	public UserData(int empId, String empName, int salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}

	public UserData(int empId, String empName, int salary, ArrayList<String> swipecard) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.swipecard = swipecard;
	}
}
