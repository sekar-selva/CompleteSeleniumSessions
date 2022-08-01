package Inheriatnce_Practice;

import OOP_inheritance.BMW;

public class TestcarFeatures extends Car {

	public static void main(String[] args) {
	
		Car c = new Car();
		c.start();
		c.engine();
		c.wheels();
		
		
		Car c= new Bmw();
		c.appliedmech();
	}

}
