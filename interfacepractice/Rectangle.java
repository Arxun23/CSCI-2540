package interfacepractice;

public class Rectangle implements Shape{
	private double length;
	private double width;
	private double area;
	private double perimeter;
	
	public Rectangle()
	{
		length = 0;
		width = 0;
	}
	
	public double getArea()
	{
		area = length * width;
		
		return area;
		
	}
	
	public double getPerimeter()
	{
		perimeter = (2 * length) + (2*width);
		return perimeter;
	}

}
