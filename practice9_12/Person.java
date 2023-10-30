package practice9_12;
/**
 * @author Luis Sanjuan-Cruz
 * establishes the person class
 */
public class Person {
	private String name;
	private String BannerID;
	
	//makes a public person class
	public Person(String name, String banID) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.BannerID = banID;
	}

	//Retrieves a name
	public String getName() {
		return name;
	}

	//Sets a name
	public void SetName(String newName) {
		name = newName;
		
	}
	
	//returns a banner ID
	public String getBannerID() {
		return BannerID;
	}
	
	//Displays a name
	public void displayInfo() {
		System.out.println("Name: " + name);
	}
}
