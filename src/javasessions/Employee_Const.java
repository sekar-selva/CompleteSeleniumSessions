package javasessions;

public class Employee_Const {
	
	String name;
	int rollno;
	double salary;
	int age;
	boolean active;
	
	public  Employee_Const()
	{
		System.out.println("Default constructor");
	}

	public Employee_Const(String name)
	{
		this.name= name;
	}
	public Employee_Const(String name, int age)
	{
		this.name = name;
		this.age = 29;
		System.out.println("2 Param constructor");
	}
	public Employee_Const (String name, int age, double salary, boolean active, int rollno)
	{
		this.name = name;
		this.rollno = rollno;
		this.salary  = salary;
		this.age = age;
		this.active = active;
	}
	public static void main(String[] args) {
		//Employee_Const ec = new Employee_Const();
		Employee_Const ec = new Employee_Const("Sekar", 29);
		System.out.println(ec.name);
		System.out.println(ec.age);
		Employee_Const ec1 = new Employee_Const("Pavi");
		System.out.println(ec1.name);
		Employee_Const ec2 = new Employee_Const("Ajesh", 25, 35.54, true, 101);
		System.out.println("Name:"+ec2.name +";"+"Roll No:"+ec2.rollno+";"+"Salary:"+ec2.salary+"Age:"+ec2.age+"Active/NotActive"+ec2.active);
		
	}

}
