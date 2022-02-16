package javasessions;

public class Employee {
	
	int empid;
	String name;
	int age;
	int sal;
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.empid = 101;
		e1.name = "Sekar";
		e1.age = 27;
		e1.sal = 56000;
		
		Employee e2 = new Employee();
		e2.empid = 102;
		e2.name = "Selva";
		e2.age = 37;
		e2.sal = 66000;
		
		Employee e3 = new Employee();
		e3.empid = 103;
		e3.name = "Aj";
		e3.age = 38;
		e3.sal = 86000;
		
		System.out.println(e1.empid +" "+ e1.name +" "+e1.age +" "+e1.sal);
		System.out.println(e2.empid +" "+ e2.name +" "+e2.age +" "+e2.sal);
		System.out.println(e3.empid +" "+ e3.name +" "+e3.age +" "+e3.sal);
		
		e1=e2; // e1 is pointing to e2
		
		System.out.println(e1.empid +" "+ e1.name +" "+e1.age +" "+e1.sal); // selva
		System.out.println(e2.empid +" "+ e2.name +" "+e2.age +" "+e2.sal);//selva
		System.out.println(e3.empid +" "+ e3.name +" "+e3.age +" "+e3.sal);// aj
		
		e2= e3;
		System.out.println(e1.empid +" "+ e1.name +" "+e1.age +" "+e1.sal); // selva
		System.out.println(e2.empid +" "+ e2.name +" "+e2.age +" "+e2.sal); // aj
		System.out.println(e3.empid +" "+ e3.name +" "+e3.age +" "+e3.sal); // aj
		
		e3 =e1;
		System.out.println(e1.empid +" "+ e1.name +" "+e1.age +" "+e1.sal); // selva that is current value odf e1
		System.out.println(e2.empid +" "+ e2.name +" "+e2.age +" "+e2.sal); //aj
		System.out.println(e3.empid +" "+ e3.name +" "+e3.age +" "+e3.sal); //sekar
	}

}
