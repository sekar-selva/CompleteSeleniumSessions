package assignments;

public class AirConditioner {
	private int temperature;
	private int speed;
	private String mode;

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public AirConditioner(String name)
	{
		
	}
	public static void main(String[] args) {
	
		AirConditioner ac = new AirConditioner("LG");
		ac.setSpeed(100);
		ac.setTemperature(36);
		ac.setMode("Normal");
		System.out.println(ac.getTemperature());
		System.out.println(ac.getMode());
		System.out.println(ac.getSpeed());
	

	}

}
