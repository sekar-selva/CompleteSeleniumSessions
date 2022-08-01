package javasessions;

import java.util.ArrayList;
import java.util.Arrays;

public class CompanyList {
	
	//WAF : company name in array and store the emp list in array like that
	//return : name, city, shareprice, ceo, geo
	
	public Object[] getCompanyList(String compName)
	{
		System.out.println("Company name is:" +compName);
		Object ob[] = new Object[5];
		if (compName.equals("MS")) {
			ob[0]= "MS";
			ob[1] = "Chennai";
			ob[2] = 345.56;
			ob[3] = "Tim";
			ob[4] = 65.34;	
		}
		else if (compName.equals("Metaverse")) {
			ob[0]= "Metaverse";
			ob[1] = "Bangalore";
			ob[2] = 1235.56;
			ob[3] = "mark";
			ob[4] = 165.34;	
			
		} 
		else 	 {
			System.out.println("Pass the correct company name:"+compName);
	}
	return ob;
}	
	
	public ArrayList<String> EcomCompany (String ecomName)
	{
		System.out.println("E commerce company name:"+ecomName);
		ArrayList<String> ecomcompany = new ArrayList<String>();
		
		switch (ecomName.toLowerCase()) {
		case "amazon":
			ecomcompany.add("Puma");
			ecomcompany.add("Nike");
			ecomcompany.add("Adidas");
			break;
			
		case "flipkart":
			ecomcompany.add("Fila");
			ecomcompany.add("Redtape");
			ecomcompany.add("Bata");
			break;
			
		case "walmart":
			ecomcompany.add("H&P");
			ecomcompany.add("Reebok");
			ecomcompany.add("UCB");
			break;
			default:
			{
				System.out.println("Please pass the correct company name:"+ecomName);
			}
			break;
		}
		return ecomcompany;
	}
	
	public static void main(String[] args) {
		CompanyList cl = new CompanyList();
		Object list[]=cl.getCompanyList("IBM");
		System.out.println(Arrays.toString(list));
		ArrayList<String> list1=cl.EcomCompany("flipkart");
		System.out.println(list1);
		

	}

}
