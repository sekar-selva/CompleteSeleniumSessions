package OOP_inheritance;

public class BMW extends Car {

	@Override
	public void start() {
		System.out.println("BMW----- start");
	}

	public void autoGear() {
		System.out.println("BMW ---- gear type");
	}
}
