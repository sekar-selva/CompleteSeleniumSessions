package builderpattern;

public class UberBooking {


	public UberBooking userRegistration()
	{
		System.out.println("Register into the application");
		return this;
	}
	public UberBooking userLogin(String userName, String password)
	{
		System.out.println("Login in to Uber App: "+userName+"; "+password);
		return this;
	}
	public UberBooking pickupDropLocation(String pickupLocaction, String dropLocation)
	{
		System.out.println("Enter the pick up and drop loction:"+pickupLocaction+"; "+dropLocation);
		return this;
	}
	
	public UberBooking listCars(String cedan, String mini, String XUV)
	{
		System.out.println("Choose the cars as per the user wish:" +cedan+"; "+mini+"; "+XUV);
		return this;
	}
	
	public UberBooking confirmBooking(int otp)
	{
		System.out.println("Confirm your Boooking:"+otp);
		return this;
	}
	public UberBooking watingforDriverconfirmation()
	{
		System.out.println("Waiting for the confirmation");
		return this;
	}
	public UberBooking pickUp()
	{
		System.out.println("Pickup the passenger");
		return this;
	}
	
	public UberBooking startRide()
	{
		System.out.println("Start the ride");
		return this;
	}
	public UberBooking endRide()
	{
		System.out.println("End the ride");
		return this;
	
	}
	public UberBooking doPayment(String cc, String upi, String cash )
	{
		System.out.println("Do payement: " + cc+"; "+ upi+"; "+ cash);
		return this;
	}
	public UberBooking cancelRide()
	{
		System.out.println("Cancel the ride");
		return this;
	}
	public UberBooking review()
	{
		System.out.println("Review the service");
		return this;
	}
	public UberBooking logout()
	{
		System.out.println("User logged out successfully");
		return this;
	}
}
