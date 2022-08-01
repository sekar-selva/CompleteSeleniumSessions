package Practice;

import java.util.Random;

public class Randomgen {

	public static void main(String[] args) {

		
		for(int i =0;i<=50;i++)
		{
				Random randomGen = new Random();
				String num = "91"+randomGen.nextInt(1111)+"0"+randomGen.nextInt(500)+"45";
				System.out.println(num);
		}

	}

}
