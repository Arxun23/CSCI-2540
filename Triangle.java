package shapes;
/**
 * @author Luis Sanjuan-Cruz
 */
public class Triangle implements Shapes {
	
	//data sets used
	private double sideA;
	private double sideB;
	private double sideC;
	private double area;
	private double perimeter;
	
	// takes in the initial measurements
	public Triangle(double sideA, double sideB, double sideC)
	{
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}
	
	// calculates the area
	public double getArea()
	{
		double S = (sideA + sideB + sideC) / 2;
		
		area = Math.sqrt(S*(S - sideA)*(S - sideB)*(S - sideC));
		
		return area;
	}
	
	//calculates the perimeter
	public double getPerimeter()
	{
		perimeter = sideA + sideB + sideC;
		
		return perimeter;
	}

}
