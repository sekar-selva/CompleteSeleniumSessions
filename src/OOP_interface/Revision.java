package OOP_interface;

public class Revision {
	
	public void redInk()
	{
		System.out.println("I am into red ink ---- method");
	}
	
	public static void main(String args[])
	{
		//Top casting - Child class obj can be refereed by the parent class obj ref varibale
		
		
		int h = 55;
		int j = h++;
		System.out.println(j); // 55
		System.out.println(h); //56
		int k = 45;
		int l = ++k;
		int z =k+1;
		System.out.println(z);
		System.out.println(h); //56
		System.out.println(j); //55
		System.out.println(k); //46
		System.out.println(l); //46
		
		int x = 5;
		int y =--x;
		System.out.println(x);  // 4
		System.out.println(y); //4
		
		int x1= 5;
		int x2= ++x1;
		System.out.println(x2); //6
		System.out.println(x1); // 6
		
		int a1= 2;
		int a2 = a1--;
		System.out.println(a1); // 1
		System.out.println(a2); // 2
		
		if(x2==x1)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fails");
		}
		String s = "Sekar";
		if(s.equalsIgnoreCase("Ssekar"))
		{
			System.out.println("Given string is correct");
		}
		else
		{
			System.out.println("Provided string is fail");
		}
	}

}
