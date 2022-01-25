package week1.day1;

public class Student {

	String studentName = "Vignesh";
	int rollNo =66;
	
	public void College()
	{
	String collName ="Anna University";	
	System.out.println(collName);
	}
	
	public static void main(String[] args) {
		Student object = new Student();
		object.College();
		int rollNumber = object.rollNo;
		System.out.println(rollNumber);
		String studentRgName = object.studentName;
		System.out.println(studentRgName);
		
	}
		
}
