package builderpattern;

public class UberTesting {

	public static void main(String[] args) {
		
		System.out.println("---------------  user1 -----------");
		UberBooking user1 = new UberBooking();
			user1.userRegistration()
			.userLogin("shekar_selva", "99945@sekar")
			.pickupDropLocation("Nungambakkam", "Sholinganallur")
			.listCars("sedan", null, null)
			.confirmBooking(3290)
			.watingforDriverconfirmation()
			.pickUp()
			.startRide()
			.endRide()
			.doPayment(null, "upi", null)
			.review()
			.logout();
			
			System.out.println("------------- user2 --------------");
			
			UberBooking user2 = new UberBooking();
			user2.userLogin("Jeff", "Welcome@123")
			.pickupDropLocation("Sholz", "Tambaram")
			.listCars(null, null, "Mahindra")
			.confirmBooking(22345)
			.cancelRide()
			.logout();
			
			UberBooking user3 = new UberBooking();
			user3.userLogin("Aj", "Welcome@123")
			.logout();
	}

}
