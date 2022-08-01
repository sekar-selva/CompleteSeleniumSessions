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
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInfo() {
		
		return age +" , "+name+" , "+" , "+rollNo;
	}
	
}
