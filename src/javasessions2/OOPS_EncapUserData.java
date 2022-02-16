package javasessions2;

public class OOPS_EncapUserData {

	public static void main(String[] args) {
		
		OOPS_Encapsulation ep = new OOPS_Encapsulation();
		ep.setAge(35);
		ep.setRollNo(101);
		ep.setName("Selva");
		
		System.out.println(ep.getAge());
		System.out.println(ep.getRollNo());
		System.out.println(ep.getName());
	}

}
