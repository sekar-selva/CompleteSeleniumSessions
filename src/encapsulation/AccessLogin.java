package encapsulation;

public class AccessLogin {

	public static void main(String[] args) {
		
		Login l1 = new Login("Shekar", "Welcome@123");
		System.out.println(l1.getUsername());
		System.out.println(l1.getPassword());
		Login l2= new Login("Pavi", "Welcome@123");
		System.out.println(l2.getUsername());
		System.out.println(l2.getPassword());
		
		l1.setPassword("Test@123");
		System.out.println("The user name is:"+l1.getUsername()+" and the Updated password is :"+l1.getPassword());
		
		Login l3 = new Login("Pavithra", "test@1234");
		//System.out.println(l3.getUsername() +":"+l3.getPassword());
		l3.signin(l3.getUsername(), l3.getPassword());
		
		l2.sso();
		LaunchBrowser lb  = new LaunchBrowser();
		lb.launchChrome();
	}

}
