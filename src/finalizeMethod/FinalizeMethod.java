package finalizeMethod;

public class FinalizeMethod {
			
		int age;

	public static void main(String[] args) {
		
		FinalizeMethod fm = new FinalizeMethod();
		fm=null;
		//System.gc();  // After assigining fm = null then if i am calling gc it will goes into the finalize method and it will call the finalize block
		//fm.age=18;
		//System.out.println(fm.age);
		Student s = new Student();
		s=null;
		System.gc();
		System.out.println("Main method");
		//System.out.println("After calling Garbage collector");
		//System.out.println("--------------"); //Hi, Naveen having one doubt regrading the garbage collector, 
			
	}
	@Override
	public void finalize()
	{
		System.out.println("I am from 1st class finalize method");
	}

}
