package Aug31;
// Luis Sanjuan-Cruz
public class Circle {
	private double radius;
	private double area;
	private String color;
	
	
	public Circle() // constructor method
	{
		radius = 0;
		area = 0;
		color = "";
	}
	
	public void setRadius(double r)
	{
		radius = r;
	}
	
	public double getArea()
	{
		area = 3.14 * radius * radius;
		return area;
	}
	
	public String setColor()
	{
		color = "blue";
		return color;
	}
	
}


