package OOP_inheritance;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BMW b = new BMW();
		b.start();

		b.fuelType();
		b.autoGear();
		b.stop();
		Car.roofTop(); // rooftop is static method so it can be accessed via classname.methodname

	}

}
