package nov27_Lab;

public class Circle {

	public static double getArea(double radius)
	{   
		double pi = 3.14;
		if(radius>0)
		{
			return pi*radius*radius;
		}else
		{
			return 0;
		}
		
	}
}
