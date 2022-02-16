package javasessions;

public class StaticProgram {
		int rollno;
		String name;
		int age;
		static String org = "ZOHO"; // if we are having any common use, then we have to use static like static webdriver
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticProgram sp = new StaticProgram();
		int rollno = 101;
		System.out.println(rollno);
		//1. how to access the static variable 
		//     --> Access directly - 
		System.out.println(sp.org); // 
		//2 .Access via class name
		// StaticProgram.org // this is recommended
		
		System.out.println(StaticProgram.org);
	}

}
