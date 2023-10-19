package shapes;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * @author Luis Sanjuan-Cruz
 */
public class Test {

	public static void main(String[] args) {
		// Sets up array for the shapes
		Shapes [] Cir = new Circle[5];
		Shapes [] Rec = new Rectangle[3];
		Shapes [] Tri = new Triangle[3];
		
		double totalCirA = 0, totalCirP = 0;
		double totalRecA = 0, totalRecP = 0;
		double totalTriA = 0, totalTriP = 0;
		
		//Reads the files for circle measurements
		try {
			File file = new File("files/circle.txt");
			Scanner scan = new Scanner(file);
			int x = 0;
			while (scan.hasNextLine())
			{
				double radius = scan.nextDouble();
				Cir[x] = new Circle(radius);
				x++;
			}
				
			scan.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//Reads the files for rectangle measurements
		try {
			File file = new File("files/rectangle.txt");
			Scanner scan = new Scanner(file);
			int x = 0;
			while (scan.hasNextLine())
			{
				double height = scan.nextDouble();
				double width = scan.nextDouble();
				Rec[x] = new Rectangle(height, width);
				x++;
			}
				
			scan.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//Reads the files for triangle measurements
		try {
			File file = new File("files/triangle.txt");
			Scanner scan = new Scanner(file);
			int x = 0;
			while (scan.hasNextLine())
			{
				double sideA = scan.nextDouble();
				double sideB = scan.nextDouble();
				double sideC = scan.nextDouble();
				Tri[x] = new Triangle(sideA, sideB, sideC);
				x++;
			}
				
			scan.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	//Combines all the areas and perimeters	
	for(int x = 0; x < 5; x++)
	{
		if(x > 2)
		{
			totalCirA += Cir[x].getArea();
			totalCirP += Cir[x].getPerimeter();
		}
		else
		{
			totalCirA += Cir[x].getArea();
			totalCirP += Cir[x].getPerimeter();
			totalRecA += Rec[x].getArea();
			totalRecP += Rec[x].getPerimeter();
			totalTriA += Tri[x].getArea();
			totalTriP += Tri[x].getPerimeter();			
		}
	}
	
	displayArea(totalCirA, "Circles");
	displayPerimeter(totalCirP, "Circles");
	displayArea(totalRecA, "Rectangles");
	displayPerimeter(totalRecP, "Rectangles");
	displayArea(totalTriA, "Triangles");
	displayPerimeter(totalTriP, "Triangles");
		
	}
	
	public static void displayArea(double total, String shape)
	{
		System.out.println("The total area for all the " + shape + " is " + total);
	}
	
	public static void displayPerimeter(double total, String shape)
	{
		System.out.println("The total perimeter for all the " + shape + " is " + total);
	}
}
		

