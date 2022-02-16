package javasessions;

public class Bank { // Class is the template or category of objects
	String name ;
	String branch;
	int profit;
	int yoe;
	
	public void Bank1()
	{
		
	}
	public static void main(String[] args) {
		
		Bank b1 = new Bank(); // object is physical entity 
		b1.name = "Axis";
		b1.branch = "Kilpauk";
		b1.profit = 132000;
		b1.yoe = 1985;
		System.out.println(b1.name +" "+b1.branch +" "+b1.profit +" "+b1.yoe);
		
		Bank b2 = new Bank();
		b2.name = "ICICI";
		b2.branch = "Tambaram";
		System.out.println(b2.name +" "+b2.branch +" "+b2.profit +" "+b2.yoe);
	}

}
