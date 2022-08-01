package javasessions;

public class Encap2 {
	public static void main (String [] args)
	{
		EncapsulationPractice enp = new EncapsulationPractice();
		enp.setName("Sekar");
		enp.setAge(26);
		enp.setAge(101);
		System.out.println(enp.info());
		enp.setInfo("Pavi", 25, 105);
		System.out.println(enp.info());
		enp.updateInfo("Pavithra", 26, 875968596);
		System.out.println(enp.newinfo());
	}

}
