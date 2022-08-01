package Inheriatnce_Practice;

public class Bmw extends Car{
	
	public void start()
	{
		System.out.println("BMW ------------start");
	}

	public void stop()
	{
		System.out.println("BMW -------------- stop");
	}
	
	public void airbags()
	{
		System.out.println("BMW -------------Airbags");
	}
	
	public void sunroof()
	{
		System.out.println("BMW----------sunroof");
	}
	
	public static void main(String[] args) {
	
		Bmw b = new Bmw();
		

	}

}
