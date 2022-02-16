package OOP_inheritance;

public class TestTrimmer {

	public static void main(String[] args) {
		
		Trimmer tr = new Trimmer();
		tr.off(); // overridden
		tr.powerConsumption(); // inherited
		tr.off(); // overridden
		tr.on(); // overridden
		tr.chargingtime(); // individual method
		
		
		//Top Casting ---> Child class obj can be referred by the parent class obj ref varible
		
		Electronics e1= new Electronics();
		e1.on();
		e1.powerConsumption();
		e1.off();
		//e1.chargingtime(); -----------> this is not allowed because this is ref type check gets failed
		
		//Down casting
		//PARENT class obj can be referred by the CHILD class obj ref variable --- this is allowed in complile time but in run time it throw the error
		Trimmer t1=(Trimmer) new Electronics(); // this is not allowed in run time
		t1.on();
		//tr.chargingtime(); --- type ref check failed
		t1.off();
		
		
		
		

	}

}
