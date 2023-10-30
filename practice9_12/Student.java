package practice9_12;
/**
 * @author Luis Sanjuan-Cruz
 */

//Establishes the student class
public class Student extends Person {
	private String major;
	private String BannerID;
	

	/**
	 * Student class but with parameters 
	 * @param name
	 * @param banID
	 * @param major
	 */
	public Student(String name, String banID, String major) {
		super(name, banID);
		this.BannerID = banID;
		this.major = major;
	}
	
	//Displays data
	public void displayInfo()
	{
		super.displayInfo();
		System.out.println("BannerID: " + getBannerID() );
		System.out.println("Major: " + major );
		System.out.println();
	}
	
	// retrieves the BannerID
	public String getBannerID()
	{
		return BannerID;
	}
}
