package javasessions;

public class MethodsPractice {

	
	// No input and no return
	public void testLogin() // method name should starts with lower case and method can be executed n number of times
	{
		System.out.println("Hey There");
	}
	
	// 2 No input and some return
	
	public int getNumber()
	{
		System.out.println("Get the Number");
		return 100;
	}	
	public String getName()
	{
		System.out.println("Get the Name");
		return "Sekar";
	}
	
	//3. some inout and some return
	
	public int sum(int a, int b)
	{
		System.out.println("Get the sum of the two numbers");
		return a+b;
	}
	public boolean forgotPassword()
	{
		System.out.println("forgot password");
		return false;
	}
	
	
	public static void main(String[] args) { // inside the method, method creation is not allowed and method is also a class data member and also method name should starts with the lower case
		
		MethodsPractice mp = new MethodsPractice();
		mp.testLogin();
		
		int num =mp.getNumber();
		System.out.println(num);
		String name =mp.getName();
		System.out.println(name);
		
		double sum =mp.sum(10, 20);
		System.out.println(sum +(5/100));
		boolean b = mp.forgotPassword();
		System.out.println(b);
		if(b)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		

	}

}
