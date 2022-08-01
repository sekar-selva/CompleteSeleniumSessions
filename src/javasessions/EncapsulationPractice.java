package javasessions;

/*
		1. 

      
*/public class EncapsulationPractice {
	 private String name;
	 private int age;
	 private int rollno;
	 private double pfnum;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String info()
	{
		return name +":"+age+":"+rollno;
	}
	public void setInfo(String name, int age, int rollno)
	{
		this.name = name;
		this.age = age;
		this.rollno = rollno;
	}
	
	public String newinfo()
	{
		return name +":"+age+":"+pfnum;
	}
	
	public void updateInfo(String name, int age, double pfnum)
	{
		this.name = name;
		this.age = age;
		this.pfnum = pfnum;
	}
	public static void main(String[] args) {
		EncapsulationPractice encp = new EncapsulationPractice();
		int age =encp.getAge();
		System.out.println(age);
		
	}

}
