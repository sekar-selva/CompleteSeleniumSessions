package OOP_interface;

public class Amazon implements US_Office, India_Office, France_Office{

	//Amazon_ Own methods
	
	public void amazonOwnIP()
	{
		System.out.println("AmazonOwnIP----own Intellectual prop");
	}
	
	public void amazonWelfacePolicy()
	{
		System.out.println("AmazonOwnWP");
	}
	
	public void Intellectual() {
		System.out.println("Amazon_office ---- Intellectual");
	}
	// US_Office Interface
	@Override
	public void lawSuit() {
		System.out.println(" Us_Office ---- Law suite");
	}

	@Override
	public void copyRights() {
		System.out.println("Us_Office ---- Copy rights");
	}

	@Override
	public void empWelfare() {
		System.out.println("Us_Office ---- empWelfare");
	}

	@Override
	public void patent() {
		System.out.println("Us_Office ---- Patents");	
	}

	// India_Office Interface
	@Override
	public void Insurnce() {
		System.out.println("India_Office ---- Insurance");	
	}

	@Override
	public void empRights() {
		System.out.println("India_Office ---- empRights");	
	}

	@Override
	public void empBenefits() {
		System.out.println("India_Office ---- empBenefits");		
	}

	// France_Office Interface
	@Override
	public void visaProcess() {
		System.out.println("France_office ---- visaProcess");
	}
	
	@Override
	public void common() {
		System.out.println("Common for all the companies");	
	}	
	
	// Global rules
	@Override
	public void empUnion() {
		System.out.println("Global Org ----emp union");
	}
	
	@Override
	public void orgRights() {
		System.out.println("Global Org------OrgRights");	
		
	}
	
	public static void main(String [] args)
	{
		Amazon az = new Amazon();
		az.copyRights();
		az.patent();
		az.Insurnce();
		az.Intellectual();
		az.empBenefits();
		az.empRights();
		az.empWelfare();
		az.visaProcess();
		az.amazonWelfacePolicy();
		az.common();
		
		//Top casting:
		
		//child class obj can be refrred from the parent class ref variable
		
		India_Office io=new Amazon();
		io.common();
		io.Insurnce();
		
		// here we can not do downcasting, lets see
		//parent class obj can be referred from the child class ref var - in this case we can not create the obj for the parent class
		
	}



	

	
	

}
