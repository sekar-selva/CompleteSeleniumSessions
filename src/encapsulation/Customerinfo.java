package encapsulation;

public class Customerinfo {

	public static void main(String[] args) {
		
		Customer c1 =new Customer("Sekar", 23,"LA");
		System.out.println(c1.getName());
		System.out.println(c1.getAge());
		System.out.println(c1.getCity());
		c1.setName("Pavi");
		System.out.println(c1.getName());
	}

}
