package javasessions;

public class MethodOverLoading {

		public int doPayment() // 0 args
		{
			System.out.println("First payment with Zero paramerer:");
			return 100;
		}
		public void doPayment(String upi) // 1 arg
		{
			System.out.println("First payment with one paramerer:");

		}
		public void doPayment(String upi, int otp) // 1 arg
		{
			System.out.println("First payment with 2 paramerer:");

		}
		public int doPayment(int otp, int upi) // 1 arg
		{
			System.out.println("First payment with 2 paramerer:");
			return 10;

		} 
		public static void main(String[] args) {
		MethodOverLoading mol = new MethodOverLoading();
		int payment =mol.doPayment();
		System.out.println(payment);
		int r= mol.doPayment(10,10);
		System.out.println(r);
		

	}

}
