package builderpattern;

public class MobieBookingTest {

	public static void main(String[] args) {
		MovieBooking mb = new MovieBooking();
		System.out.println("User scenario ---------------- ONE");
		mb.doLogin("sekar4evr@yopmail.com", "welcome@123").doSelectLocation("salem").doSearchMovie("KGF-2")
				.doSelectMovie("Selected movie - KGF-2").bookTicket().selectShowandTIme("first", "J")
				.bookingSummary(320).doPayment("UPI", "").logout();

		System.out.println("Scenario -2");
		MovieBooking mb1 = new MovieBooking();
		mb.doLogin("sekar4evr@yopmail.com", "welcome@123").doSelectLocation("salem").doSearchMovie("KGF-2")
				.doSelectMovie("Selected movie - KGF-2").bookTicket().selectShowandTIme("first", "J")
				.bookingSummary(320).doPayment("", "324").logout();

		System.out.println("Scenario -2");
		MovieBooking b2 = new MovieBooking();
		mb.doLogin("sekar4evr@yopmail.com", "welcome@123").doSelectLocation("salem").doSearchMovie("KGF-2").logout();

		
		String str = "welcome";
		String wov = "aeiou";
		for(String e : str)
			System.out.println("The vow's are:"+str);
		
			
		}
	
	}

}
