package javasessions;

import javasessions2.UserData;

/*// 
 * 
 	1 . Constructor and class name is same 
	2. Duplicate constrvutors are not allowed
	3. Constrcutor does not return anything or it doesnot have any return type
	4. constructor is always part of the object
	5. constructor can be overloaded
	6. there are multiple constructors are avilable - default, single, 2 parameterized
	7. when ever you are creating the obj, constructor will be called
*/


public class LoginConst {
	
	String username;
	String pwd;
	int otp;
	String login;
	boolean auth;
	
	public LoginConst()
	{
		System.out.println("Default login, without UN & PWD: ");
	}
	public LoginConst(String username)
	{
		this.username = username;
		System.out.println("Default login, with UN & Without PWD: "+username);
	}	
	public LoginConst(String username, String pwd)
	{
		this.username = username;
		this.pwd = pwd;
		System.out.println("Basic Login Method");
	}
	public LoginConst(String username, String pwd, int otp)
	{
		this.username = username;
		this.pwd = pwd;
		this.otp = otp;
		System.out.println("Basic Login Method:" +username+"<>"+pwd+"<>"+otp);
	}

	public static void main(String[] args) {
		LoginConst login = new LoginConst();
		System.out.println(login.username);
		LoginConst login1 = new LoginConst("Pavi");
		LoginConst login2 = new LoginConst("sekar", "sekar@123");
		//System.out.println(login1.username+"::"+login1.pwd);
		LoginConst login3 = new LoginConst("Amazon", "Welcome@123", 9801);
		System.out.println(login3.username+":"+login3.pwd+":"+login3.otp);
	}

}
