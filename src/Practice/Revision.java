package Practice;

public class Revision {

	public static void main(String[] args) {

			int a=10,b=10;
			System.out.println(a+b);
			char c = 'a';
			char d = 'b';
			String e = "Hello";
			System.out.println(a+b+c+d); // why, this a and b is considered as Ascii values and the a is 97 and b is 98, c = 99. d =100 like that
			System.out.println(e+a);
			System.out.println(a+e);
			System.out.println(c+e);
			System.out.println(0.1+0.5); //
			System.out.println(9.0/0.0);
			System.out.println(0.0/0.0);
			//post increment
		
			int rt = 4;
			int tr = rt++;
			System.out.println(tr); // 4
			
			//pre increment
			
			int ty= 8; //
			int yt = ++ty; //
			System.out.println(ty); //9
			System.out.println(yt); //9
			
			int rt1 = 4;
			int tr1 = rt1++;
			System.out.println(tr1); // 
			
			//pre decrement
			
			int ty1= 8; //
			int yt1 = --ty1; //
			System.out.println(ty1); // 7
			System.out.println(yt1); // 7
			
		//post decrement
			int h = 2;
			int l = h--;
			System.out.println(h); //1
			System.out.println(l); //2
			int o = 5;
			System.out.println(o++); //5
			System.out.println(o);
			char c1 = 'a';
			
			System.out.println("The value is:"+(int)c1++);
			System.out.println((int)c1);
			
			
			int u = 10;
			int i = 20;
			if(u==i)
			{
				System.out.println("Fail");
			}
			if(u<i)
			{
				System.out.println("Pass");
			}
			if(u>=i)
			{
				System.out.println("Fail");
			}
			else
			{
				System.out.println("Fail"); // dead code
			}
			
			boolean flag =! true;
			if(flag)
			{
				System.out.println("Pass");
			}
			else
			{
				System.out.println("Fail");
			}
			String s1 ="SEKAR";
			String s2 = "sekar";
			if (s1.equals(s2)) {
				System.out.println("Pass");
			}
			else
			{
				System.out.println("Not equals");
			}
			if(s1.equalsIgnoreCase(s2))
			{
				System.out.println("equals");
			}
			
			// test with the multiple browsers
			System.out.println("If - else Logic");
			System.out.println("**************************");
			System.out.println("The problem with the code is, first the string is equals then it wil come into the next if part and it will check all the if part");
			String browser = "chrome";
			if(browser.equals("chrome")) // if one else is avalilable that is applicable for that particular if -else part, so again it will print the else part also in the console as a result
			{
				System.out.println("Launch Chrome");
			}
			if(browser.equals("opera"))
			{
				System.out.println("Launch Opera");
			}
			if(browser.equals("Ie"))
			{
				System.out.println("Launch IE");
			}
			else {
				System.out.println("Please pass the correct browser");
			}
			
	}

}
