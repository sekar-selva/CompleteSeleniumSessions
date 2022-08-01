package builderpattern;

public class MovieBooking {
	
		public MovieBooking doLogin(String username, String pwd)
		{
			System.out.println("Login into the Bookmy show application");
			System.out.println("Enter your user name:"+username);
			System.out.println("Enter your pwd:"+pwd);
			System.out.println("Login is successful");
			return this; 
		}
		
		public MovieBooking doSelectLocation(String city)
		{
			System.out.println("Please enter your city name:" +city);
			return this;
		}
		
		public MovieBooking doSearchMovie(String movieName)
		{
			System.out.println("Please enter the movie name:" + movieName);
			return this;
		}
		
		public MovieBooking doSearchMovie(String movieName, String location)
		{
			System.out.println("Please enter the movie name with location:" + movieName +","+ location);
			return this;
		}
		
		public MovieBooking doSelectMovie(String mvName)
		{
			System.out.println("Select the movie from the search results:" +mvName);
			return this;
		}
		
		public MovieBooking bookTicket()
		{
			System.out.println("click on the book tickets:");
			return this;
			
		}
		public MovieBooking selectShowandTIme(String showtime, String screen)
		{
			System.out.println("Select the show time and the screen :" +showtime +";"+screen);
			return this;
		}
		
		public MovieBooking bookingSummary(int price )
		{
			System.out.println("The booking summary is:" +price);
			return this;
		}
		public MovieBooking doPayment(String upi, String cc)
		{
			System.out.println("select the payment mode :" +upi +":"+cc);
			return this;
		}
		public MovieBooking logout()
		{
			System.out.println("Logged out from the application");
			return this;
		}
		
	public static void main(String[] args) {
		
		MovieBooking m = new MovieBooking();
	}

}
