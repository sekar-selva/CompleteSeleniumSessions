package javasessions;

public class Methodrevision {
	
	// 1. Inside the method, method can not be created
	// 2. Duplicate methods are not allowed
	// 3. Methods are always independent
	// 4. Method is a class member and we use the metod N number of times
	
	
	// Method name should starts with lower case, 
	// 1. No input and No return

	public void test()
	{
		System.out.println("Hello welcome to the Test metod");
	}

	// 2. No input and return some thing
	public int  testLogin()
	{
		System.out.println("Heloo welcome to Test login method");
		return 100;
	}
	
	// 3. Some input and some return
		public int  add(int a, int b) // parameter
		{
			System.out.println("Add method");
			int c = a+b;
			return c;
		}
	public static void main(String[] args) {
		Methodrevision t = new Methodrevision();
		System.out.println("------------Test Method : No input and no return type------------");
		t.test();
		System.out.println("------------Test Login Method------------");
		int  returntext = t.testLogin();
		System.err.println("Returned value  is:"+returntext);
		
		int addition = t.add(13,17); // args
		System.out.println(" Calling the Add method :"+addition);
		
		int newadd= t.add(125, 123);
		System.out.println("New add"+(newadd-40));

	}
	
	

}
