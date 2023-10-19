package shapes;
import java.lang.Math;
/**
 * @author Luis Sanjuan-Cruz
 */
public class Circle implements Shapes {
	
	//data sets used
	private double radius;
	private double perimeter;
	private double area;
	
	// takes in the initial measurements
	public Circle(double radius) {
		this.radius = radius;
	}

	// calculates the area
	public double getArea()
	{
		area = Math.PI * Math.pow(radius, 2);
		return area;
	}
	
	//calculates the perimeter
	public double getPerimeter()
	{
		perimeter = 2 * Math.PI * radius;
		return perimeter;
	}

}
