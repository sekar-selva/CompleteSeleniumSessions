package javasessions;

public class MethodChaining {

	
	public static void a()
	{
		System.out.println("A method");
		MethodChaining mc1= new MethodChaining();	
		mc1.b();
}
	public static void a(int a)
	{
		System.out.println("Hellloooooooooow");
	}
	public void b()
	{
		System.out.println("B method");
		c();
	}
	
	public void c()
	{
		
		System.out.println("C method");
		d();
	}
	public void d()
	{
		System.out.println("D method");
	}
	public static void main(String[] args) {
		MethodChaining mc = new MethodChaining();
		
		MethodChaining.a();
		mc.b();
		a();
		
		

	}

}
