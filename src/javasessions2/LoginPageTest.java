package javasessions2;

public class LoginPageTest {

	public static void main(String[] args) {
	
		
		LoginPage u1= new LoginPage("Sekar", "Welcome@123");
		System.out.println(u1.getUserName()+","+u1.getPassWord());
		
		LoginPage u2 = new LoginPage("Amresh", "test@123");
		System.out.println(u2.getUserName()+","+u2.getPassWord());
		u2.setPassWord("123@test"); // update the password or it will act as setting the password
		System.out.println(u2.getUserName()+","+u2.getPassWord());
		
		
		u2.doLogin(u2.getUserName(), u2.getPassWord());
		u1.ssoLogin();
	}

}
