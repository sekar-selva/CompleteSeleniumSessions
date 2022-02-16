package OOP_inheritance;

public class TestIphone {

	public static void main(String[] args) {


		Iphone i = new Iphone();
		i.displaySize(); // overridden method because it is alredy avialable in parent but that is not required for me
		i.camera(); // inherited from parent
		i.processor(); // overridden method because it is alredy avialable in parent but that is not required for 
		i.ramCapacity(); //inherited from parent
		i.internalMemory(); //inherited from parent
		i.os(); // own method
		//i.headPhoneJack(); //this is privaate method, you can not over ride
		Phone.fastCharging(); // if we want to access private method, have to directly call that method using class name
		
		Phone p1 =new Iphone();
		p1.camera();
		p1.processor();
		//p1.os(); // this is iphone's individual method, so we cannot access it--- that is ref type check is not allowed
	}

}
