package encapsulation;

public class Login {

	
	private String username;
	private String password;
	
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public Login(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public void signin(String username, String password)
	{
		System.out.println("Please enter the user name:" +username);
		System.out.println("Please enter the password:" +password);
		System.out.println("Please click on the login button");
		System.out.println("Login successful");
	}
	
	public void sso()
	{
		System.out.println("Single sso login");
		System.out.println("User name:"+this.username);
		System.out.println("Password:"+this.password);
		
		System.out.println("Login successful");
	}
}
