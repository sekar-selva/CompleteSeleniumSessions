package javasessions;

public class InheritBmw  extends InheritCar{

	public void start(String name)
	{
		System.out.println("BMW --- start");
	}
	
	public static void wheels()
	{
		System.out.println("BMW ---- wheels");
	}
	public void airBag()
	{
		System.out.println("BMW ---- Airbag");
	}
	
	public void breakingsystem()
	{
		System.out.println("BMW ---- Breaking system");
	}
	public void stop()
	{
		System.out.println("BMW ----- stop");
	}
	
	public  void turbo()
	{
		System.out.println("Turbo");
	}
	public static void main(String[] args) {
		InheritBmw bmw = new InheritBmw();
		bmw.start("Hey");
		bmw.refuel();
		bmw.autopark();
		bmw.autodrive();
		bmw.tankCapacity();
		bmw.airBag();
		bmw.breakingsystem();
		bmw.stop();
		bmw.wheels();
		bmw.turbo();
		
		

	}

}
