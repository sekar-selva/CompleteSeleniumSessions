package javasessions2;

public class LoginPage {
	
	private String userName;
	private String passWord;
	public LoginPage(String userName, String passWord) {
		this.userName = userName;
		this.passWord = passWord;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	public void doLogin(String userName, String passWord)
	{
		System.out.println("Login page");
		System.out.println("Please enter the username:"+userName);
		System.out.println("Please enter the password:"+passWord);
		System.out.println("Click login button");
		System.out.println("Login is done");
		
		
	}
	public void ssoLogin()
	{
		System.out.println("SSO Login");
		System.out.println("Please enter the username:"+this.userName);
		System.out.println("Please enter the password:"+this.passWord);
			
	}
	
	
	

}
