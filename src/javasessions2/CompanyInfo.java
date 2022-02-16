package javasessions2;

import java.util.ArrayList;

public class CompanyInfo {
	
	String comName;
	long compEstblishDate;
	int prodManufact;
	double sharePrice;
	ArrayList<String> shareHoldernames;
	

	public CompanyInfo(String comName) {
		this.comName = comName;
	}

	public CompanyInfo(String comName, long compEstblishDate) {
		
		this.comName = comName;
		this.compEstblishDate = compEstblishDate;
	}

	public CompanyInfo(String comName, long compEstblishDate, int prodManufact, double sharePrice,
			ArrayList<String> shareHoldernames) {

		this.comName = comName;
		this.compEstblishDate = compEstblishDate;
		this.prodManufact = prodManufact;
		this.sharePrice = sharePrice;
		this.shareHoldernames = shareHoldernames;
	}

	public CompanyInfo(String comName, long compEstblishDate, int prodManufact) {
		
		this.comName = comName;
		this.compEstblishDate = compEstblishDate;
		this.prodManufact = prodManufact;
	}
	
	
	public static void main(String[] args) {
		CompanyInfo com = new CompanyInfo("Flipkart");
		System.out.println(com.comName); // for printing the construct value
		CompanyInfo compinfo = new CompanyInfo("Amazon", 1950, 10);
		System.out.println(compinfo.comName);
		

	}

}
