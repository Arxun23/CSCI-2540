package schooldatabase;
// Luis Sanjuan-Cruz

public class database {
	String StudentID;
	String StudentName;
	int MidTerm;
	int Final;
	private char GPA;
	
	public database()
	{
		StudentID = "";
		StudentName = "";
		MidTerm = 0;
		Final = 0;
	}
	
	public char getGPA()
	{
		double finalGrade = (MidTerm + Final)/2;
		
		if (finalGrade <= 100 && finalGrade >= 90)
		{
			GPA = 'A';
		}
		else if (finalGrade < 90 && finalGrade >= 80)
		{
			GPA = 'B';
		}
		else if (finalGrade < 80 && finalGrade >= 70)
		{
			GPA = 'C';
		}
		else if (finalGrade < 70 && finalGrade >= 60)
		{
			GPA = 'D';
		}
		else if (finalGrade < 60)
		{
			GPA = 'F';
		}
		
		return GPA;
	}
	
	public double setfinal(int a)
	{
		Final = a;
		return Final;
	}
	
	public double setmid(int b)
	{
		MidTerm = b;
		return MidTerm;
	}
	
	public String SetName(String Name)
	{
		StudentName = Name;
		return StudentName;
	}
	
	public String SetID(String ID)
	{
		StudentID = ID;
		return StudentID;
	}
	

}
