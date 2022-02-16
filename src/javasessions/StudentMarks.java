package javasessions;

public class StudentMarks {

	
	public int getStudentMarks(String studentname)
	{
		System.out.println("Student Marks List");
		int marks = -1;
		if(studentname.equalsIgnoreCase("Sekar"))
		{
			marks= 90+5;
		}
		else if (studentname.equalsIgnoreCase("Tom"))
		{
			marks = 80;
		}
		else if (studentname.equalsIgnoreCase("Adam"))
		{
			marks = 65;
		}
		else
		{
			System.out.println("Plz pass the correct student name");	
		}
		return marks;
	}
	public static void main(String[] args) {
		StudentMarks std = new StudentMarks();
		int score =std.getStudentMarks("sekar");
		System.out.println(score);
		if(score ==-1)
		{
		System.out.println("Please dont generate the mark sheet");	
		}
		
		
	}

}
