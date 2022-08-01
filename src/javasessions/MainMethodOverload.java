package javasessions;

public class MainMethodOverload {

	public  void main(String ofz, int age ) {
		System.out.println("I am from this method");
	}
	public static void main (int a)
	{
		System.out.println("I am from int method:"+a);
	}
	public static void main(String name)
	{
		System.out.println("I am from string method:" + name);
	}
	public void main(double d)
	{
		System.out.println("I am from double method:" +d);
	}
public static void main(String [] args) // Main method is never part of the object, while executing the pgm jvm wil look into the main mehod. if it is not static, then jvm ca nnot create the obj fir the main methid, and it is not jvm;s responsiblity. user has to
// create the object to avoid this confusion, by default main method  is static in nature

{
	System.out.println("Hello");
	MainMethodOverload mm  = new MainMethodOverload();
	main(10);
	MainMethodOverload.main("Sekar");
	main("Pavi");
	MainMethodOverload.main("Sekar v Pavi");
	mm.main(15.34);
	mm.main(14.678);
}
}
