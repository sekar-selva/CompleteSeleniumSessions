package finalizeMethod;

public class Student {
	String name;
	@Override
	public void finalize()
	{
		System.out.println("Student finalize method");
	}
}
