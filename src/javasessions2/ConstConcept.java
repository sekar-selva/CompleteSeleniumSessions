package javasessions2;

public class ConstConcept {
	
	int empRollNo;
	String empName;
	String empCity;
	
	public ConstConcept() // zero param const
	{
		System.out.println("Default constructor");
	}
	public ConstConcept(int empRollNo, String empCity) // single parameter constructor
	{
		this.empRollNo = empRollNo; // this class variable equals to local variable
		//empCity = this.empCity;
		System.out.println("Single param constructor");
		
	}
	public ConstConcept(int empRollNo, String empName, String empCity)
	{
		this.empRollNo = empRollNo;
		this.empName = empName;
		this.empCity = empCity;
	}
	
	
	public static void main(String[] args) {
		ConstConcept con = new ConstConcept(101, "Chennai"); // when ever you are cteating the obj, at the moment construct will be called
		System.out.println(con.empRollNo);
		System.out.println(con.empCity);
		ConstConcept con2 = new ConstConcept(102,"Sekar", "Bangalore");
		System.out.println(con2.empRollNo+" " +con2.empName+" "+con2.empCity);
	}

}
