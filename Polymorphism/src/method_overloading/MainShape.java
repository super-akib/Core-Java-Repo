package method_overloading;
import java.util.Scanner;

public class MainShape
{

	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter height of Rectangle:");
        double heigth = sc.nextDouble();
        System.out.print("Enter width of Rectangle");
        double width = sc.nextDouble();
        System.out.print("Enter side of square:");
         double side = sc.nextDouble();
         
         Shape s1 = new Shape();
         s1.calculateArea(side);
         s1.calculateArea(heigth, width);
         sc.close();

	}

}
