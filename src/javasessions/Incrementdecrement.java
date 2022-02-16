package javasessions;

public class Incrementdecrement {

	public static void main(String[] args) {
		
		int a =3;
		int b= a++;
		System.out.println(a);  //4
		System.out.println(b); //3
		
		int c = 4;
		int d = ++c;
		System.out.println(c); //5
		System.out.println(d);//5
		

		int x =5;
		int y= x++; 
		System.out.println(y); //5
		System.out.println(x); //6
		
		
		int x1 = 5;
		int x2 = ++x1;
		System.out.println("This part");
		System.out.println(x2); //6
		System.out.println(x1); //6
		
		int z = -98;
		int zx = --z;
		System.out.println(zx); //-99
		System.out.println(z);//-99
		
		int m = 65;
		int n =m++;
		System.out.println(m); //66
		System.out.println(n); //65
		
		
		int v = 7; // 
		int f = ++v;  //
		System.out.println(f); //8
		System.out.println(v); //8
		
		
		System.out.println(v++);
		System.out.println(v);
		System.out.println(v--);
		System.out.println(v);
		
		int o = 3;
		System.out.println(o--);
		System.out.println(o);
		System.out.println(o++);
		System.out.println(o);
		
		int t = 2;
		int u= t--;
		System.out.println(t);//1
		System.out.println(u); //2
		
		
		char q = 'c';
		System.out.println((int)++q);  //100
	}

}