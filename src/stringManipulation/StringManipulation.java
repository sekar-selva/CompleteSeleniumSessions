package stringManipulation;

import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) {
		String s = "Hey Welcome to the World of QA Automation";
	
		//System.out.println(a);
		System.out.println("----------*******************-------------------");
		String sentence1 = "hey this what you have been looking into this..?";
		String sentence = "queuequeueququqqqqq";
		System.out.println(s.length()); // 41
		System.out.println(s.charAt(28)); //Q
		System.out.println(s.charAt(40));
		System.out.println("Hey");
		System.out.println(s.charAt(s.length()-15));  
		System.out.println(s.indexOf('h'));
		String lc = s.toLowerCase();
		String uc = s.toUpperCase();
		System.out.println(lc);
		System.out.println(uc);
		System.out.println(s.indexOf('e')); //1
	//Hey Welcome to the World of QA Automation
		System.out.println(s.indexOf('e',s.indexOf('e')+1)); //5
		
		
		
		int seq1 = sentence.indexOf('q');
		System.out.println(seq1);
		int seq2 = sentence.indexOf('q',seq1+1);
		System.out.println(seq2);
		int seq3 = sentence.indexOf('q',seq2+1);
		System.out.println(seq3);
		System.out.println("--------------------");
		System.out.println(sentence1.indexOf("Are"));
		String a1 = "Are you there";
		
		if (a1.equals(seq1)) {
			System.out.println("True");
		}
		else
		{
			System.out.println("String not found");
		}
		if(a1.indexOf("Are1")>=0)
		{
		System.out.println("String is found from a1");	
		}
		else
		{
			System.out.println("String is not found");
		}
		System.out.println(sentence1.indexOf("been"));
		System.out.println(sentence1.indexOf("this"));
		System.out.println(sentence1.indexOf("this",sentence1.indexOf("this")+1));
		
		String x1 = "Hey There";
		String x2 = "Hey There";
		System.out.println(x1==x2); // this will give you true bcoz this is string literal
		
		String x3= new String ("Hello Java");
		String x4= new String ("Hello Java"); // here we are comparing string obj
		String x5= new String("Hey There");
		System.out.println("<----------------->");
		System.out.println(x3==x4);  // false, bcoz, have to comapre with .equals method
		System.out.println(x3.equals(x4)); // true
		System.out.println(x1==x5); // this is comparing b/w the string literal and string obj, so it will give fasle
		
		String s4= null;
		String s5 = "Sekar";
		//System.out.println(s4.equals(s5)); // Null pointer exception
		try {
			s4.equals(s5); // comapring null with string will give NPe
		} catch (NullPointerException e) {
				System.out.println("Null pointer exception");
				e.printStackTrace();
				}
		System.out.println(s5.equals(s4)); // but comparing string with null will give you the false error
		
		//equals
		String m1 = "Hello Python";
		String m2 = "hello python ";
		System.out.println(m1.equals(m2)); // will give false bcoz it is case sensitive
		System.out.println(m1.equalsIgnoreCase(m2)); // igonre the casing between the strings
		
		System.out.println("---------- Contains ----------------");
		// contains
		System.out.println(m1.contains("hello")); // case sensitive  and have to pass the exact key word so false
		
		//Trim()
		String m3 = "             Hey helllllllllllllooooo                www, how are                   you";
		System.out.println(m3.trim()); // will trim the front and back un ncessary space
	
		//replace
		System.out.println(m3.replace(" ", ""));
		String date = "24-12-1990";
		System.out.println(date.replace("-", "/"));
		
		//Spit 
		
		String months = "Jan_Feb_Mar_Apr";
		String month[] = months.split("_"); // return type of the split is string array[]
		System.out.println(month.length);
		System.out.println(Arrays.toString(month));
		
		System.out.println(months);
		System.out.println(month[3]);
		
		String rm = "xXSeleniumXxXxPythonXxXRubyXXxCxxX";
		String split[] = rm.split("xX");
		System.out.println("--------------");
		System.out.println(split[0]);
		System.out.println("--------------");
		System.out.println(Arrays.toString(split));
		
		System.out.println("------------");
		String empdata = "Sekar;Selva;SET;BCT;Chennai";
		String empd[] =empdata.split(";");
		
		for(String d : empd)
		{
			System.out.println(d);
		}
		System.out.println(Arrays.toString(empd));
		
	}

}
