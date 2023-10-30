package schooldatabase;

public class SchoolTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		database Stu1 = new database();
		Stu1.SetID("A001");
		Stu1.SetName("John");
		Stu1.setmid(89);
		Stu1.setfinal(75);
		
		database Stu2 = new database();
		Stu2.SetID("A002");
		Stu2.SetName("Bob");
		Stu2.setmid(90);
		Stu2.setfinal(80);
		
		System.out.println("ID: " + Stu1.StudentID);
		System.out.println("Name: " + Stu1.StudentName);
		System.out.println("Midterm Grade: " + Stu1.MidTerm);
		System.out.println("Final Exam Grade: " + Stu1.Final);
		System.out.println("GPA: " + Stu1.getGPA());
		
		System.out.println("ID: " + Stu2.StudentID);
		System.out.println("Name: " + Stu2.StudentName);
		System.out.println("Midterm Grade: " + Stu2.MidTerm);
		System.out.println("Final Exam Grade: " + Stu2.Final);
		System.out.println("GPA: " + Stu2.getGPA());
		
		
		
		
	}

}
