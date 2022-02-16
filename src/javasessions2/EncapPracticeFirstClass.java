package javasessions2;

public class EncapPracticeFirstClass {
	private int age;
	private String name;
	private int rollNo;
	
	
	public void setInfo(int age, String name, int rollNo)
	{
		this.age = age;
		this.name = name;
		this.rollNo = rollNo;
	}
	
	public String getInfo() {
		
		return age +" , "+name+" , "+" , "+rollNo;
	}
	
}
