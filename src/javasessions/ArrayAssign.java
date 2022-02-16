package javasessions;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayAssign {

	public static void main(String[] args) {
		
		
		//1. int array
		
		int x[]= new int [5];
		x[0] = 5;
		x[1]=7;
		x[2]=9;
		x[3]=11;
		x[4]=13;
		//System.out.println(x);
		int length =x.length;
		System.out.println(length);
		for(int i=0;i<length;i++)
		{
			System.out.println(x[i]);
		}
		System.out.println("For each loop output");
		for(int e :x)
		{
			System.out.println(e);
		}
		System.out.println("-----------");

		System.out.println(Arrays.toString(x));
		
		
		//2. char array:
		System.out.println("-----------");
		char c[] = new char[5];
		c[0]='s';
		c[1]='e';
		c[2]='k';
		c[3]='a';
		c[4]='r';
		System.out.println(c.length);
		for(int j =0; j<c.length;j++)
		{
			System.out.println(c[j]);
		}
		System.out.println(Arrays.toString(c));
		System.out.println("For each loop output");
		for(char e : c )
		{
			System.out.println(e);	
		}
		System.out.println("-----------");	
	
	
	//3. Double Array:
	
		double d[] = new double[4];
		d[0]= 66.56;
		d[1]=55.66;
		d[2]=44.77;
		d[3]=22.56;
		System.out.println(d.length);
		System.out.println(d[0]+d[1]);
		System.out.println("-----------");	
		for(int k=0;k<d.length;k++)
		{
			System.out.println(d[k]);
		}
		System.out.println("For each loop output");
		for(double e :d)
		{
			System.out.println(e);
		}
		System.out.println(Arrays.toString(d));
		System.out.println("-----------");	
		//4. String array:
		
		String m[]= new String[5];
		m[0]="Apple";
		m[1]= "Orange";
		m[2]="Samsung";
		m[3]="Nokia";
		m[4]="Mi";
		for(String e:m)
		{
			System.out.println(e);
		}
		System.out.println(Arrays.toString(m));
		
		//5. Object Array:
		
		Object emp[] = new Object[5];
		emp[0]=101;
		emp[1]="Sekar";
		emp[2]='M';
		emp[3]=65.500;
		emp[4]=true;
		System.out.println("-----------");	
		System.out.println("Length of the array is:" +emp.length);
		System.out.println(Arrays.toString(emp));
		for(int q= 0;q<emp.length;q++)
		{
			System.out.println(emp[q]);
		}
		
		ArrayList <Object> al = new ArrayList<Object>();
		
		al.add(100);
		al.add("Sekar");
		System.out.println(al.size());
		for(int h=0;h<al.size();h++)
		{
			System.out.println(al.get(h));
		}
		
		

}
}