package practice9_12;

public class Employee extends Person {
	private String name;
	private String BannerID;
	private String Dept;
	private double salary;
	

	public Employee(String name, String banID, String Dept) {
		super(name, banID);
		// TODO Auto-generated constructor stub
		this.name = name;
		this.BannerID = banID;
		this.Dept = Dept;
	}
	
	public void displayInfo()
	{
		super.displayInfo();
		System.out.println("Title: Student");
		System.out.println("Name " + name);
		System.out.println("Department: " + Dept);
	}
	
	public String getBannerID()
	{
		return BannerID;
	}
	
	

}
