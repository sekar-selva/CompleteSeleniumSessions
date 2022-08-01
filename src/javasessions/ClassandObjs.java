package javasessions;

public class ClassandObjs {
	
	String name;
	int age;
	int rollNo;
	int marks;
	boolean q;
	char section;
	// these are called as global variables
	public static void main(String[] args) {
		
		String name = "Sekar";
		System.out.println(name);
		
		ClassandObjs co = new ClassandObjs();
		co.rollNo = 101;
		co.name = "Arun";
		co.age = 29;
		co.marks = 499;
		co.q= true;
		co.section = 'A';
		System.out.println(co.rollNo+":"+co.name+":"+co.age+":"+co.marks+":"+co.q+":"+co.section);
	
		ClassandObjs c2 = new ClassandObjs();
		System.out.println(c2.rollNo+":"+c2.name+":"+c2.age+":"+c2.marks+":"+c2.q+":"+c2.section);

	}

}
