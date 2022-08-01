package builderpattern;

public class AmazonBuilderPattern {

	
		public AmazonBuilderPattern login()
		{
			System.out.println("login to the amazon app");
			return this;
		}
		public AmazonBuilderPattern login(String username, String pwd)
		{
			System.out.println("login using the username and the password :" +username +";"+pwd);
			return this;
		}
		public AmazonBuilderPattern searchProducts(String prodname, int prodPrice)
		{
			System.out.println("Search the product using prod name and prod price:" +prodname+";"+prodPrice);
			return this;
		}
		public AmazonBuilderPattern selectProd(String prName)
		{
			System.out.println("The selected prod is:"+prName);
			return this;
		}
		public AmazonBuilderPattern payment(String amazonpay, String cc)
		{
			System.out.println("Select the payment method:" +amazonpay);
			return this;
		}
		public AmazonBuilderPattern payment(int cashonDel, String upi)
		{
			System.out.println("Select another payment methods :"+cashonDel+upi);
			return this;
		}
		public AmazonBuilderPattern getOrderid(int orderid)
		{
			System.out.println("The order id is:"+orderid);
			return this;
		}
		public  AmazonBuilderPattern logout() {
			System.out.println("Logout from the app");
			return this;
		}


}
