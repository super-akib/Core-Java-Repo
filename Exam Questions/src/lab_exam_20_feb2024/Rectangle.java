package lab_exam_20_feb2024;

public class Rectangle  extends Shape
{
	protected  double height;
	protected  double lenght;

	public Rectangle(double base, double height,double lenght) {
		super(base);
		this.lenght = lenght;
		this.height = height;
	}
	
	public void calculateArea()
	{
		System.out.println("Area of Rectangle:"+(2*height*(lenght+base))); ;
	}

}
