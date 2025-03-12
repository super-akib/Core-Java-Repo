package nov11_LabDay12;
import java.util.Scanner;
public class A {
		public static void main(String []args)
	    {  
	      double r ;    
	      Scanner sc = new Scanner(System.in);
	      System.out.print("Enter a radius:");
	      r = sc.nextDouble();
	      System.out.println(areaOfCircle(r));
	      sc.close();
	    }
	public static double areaOfCircle(double redius)
	{
		return (redius*redius)*Math.PI;
	}
 }
