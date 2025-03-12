package method_overloading;

public class Shape 
{    // method  overloading
    // Method for Rectangle area find
	public void calculateArea(double height,double width)
	{
		System.out.println("Area of Rectangle is:"+(height*width));
	}
	// Method for Square area find
	public void calculateArea(double side)
	{
		System.out.println("Area of Square is:"+(side*side));
	}
}
