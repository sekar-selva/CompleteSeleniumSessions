package javasessions;

public class Browser {
	
	public boolean launchBrowser(String name)
	{
		if (name.trim().equalsIgnoreCase("Chrome")){
			System.out.println("Launch the chrome Browser");
			return true;
		}
		else if (name.trim().equalsIgnoreCase("Firefox")) {
			System.out.println("Launch the chrome Browser");
			return true;
		}
		else if (name.trim().equalsIgnoreCase("Safari")) {
			System.out.println("Launch the chrome Browser");
			return true;
		}
		else {
			System.out.println("Pleae pass the right browser");
			return false;
		}
		
	}
	public int studentMarks(String stdName)
	{
		int mark = -1;
		System.out.println("Student name is:"+stdName);
		if (stdName.equals("Sekar")) {
			System.out.println("Hello Sekar");
			mark = 90+5+1;
	}
		else if (stdName.equals("Pavi")) {
			System.err.println("Hello Pavi");
			mark =95;
		}
		else if (stdName.equals("Boopathi")) {
			System.out.println("Hello Boopathi");
			mark =97;
		}
		else {
			System.out.println("No Student is matching the list");
		}
		return mark;
			
		}

	public static void main(String[] args) {
		Browser br = new Browser();
		
		if (br.launchBrowser("CHROME")) {
			System.out.println("Browser is getting launched");
		} else {
			System.out.println("Not able to launch the browser");
		}
		
		int marks = br.studentMarks("Sekar");
		System.out.println("Marks for the student is:"+marks);
		if (marks==-1) {
			System.out.println("Student is not exist");
			
		}

	}

}
