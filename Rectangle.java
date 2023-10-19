package shapes;
/**
 * @author Luis Sanjuan-Cruz
 */
public class Rectangle implements Shapes{
	//data sets used
	private double area;
	private double perimeter;
	private double width;
	private double height;
	
	// takes in the initial measurements
	public Rectangle(double height, double width)
	{
		this.height = height;
		this.width = width;
	}
	
	// calculates the area
	public double getArea()
	{
		area = width * height;
		
		return area;
	}
	
	//calculates the perimeter
	public double getPerimeter()
	{
		perimeter = 2*(width + height);
		
		return perimeter;
	}

}
