package lab_exam_20_feb2024;

public class Triangle extends Shape
{
	protected double height;

	public Triangle(double height,double base) {
		super(base);
		this.height = height;
	}
	
	public void calculateArea()
	{
		System.out.println("Triange Area:"+(2*3.14*base*base));
	}
	

}
