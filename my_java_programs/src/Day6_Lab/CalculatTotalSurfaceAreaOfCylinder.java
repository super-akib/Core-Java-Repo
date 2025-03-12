package Day6_Lab;
import java.util.Scanner;
public class CalculatTotalSurfaceAreaOfCylinder {
 public static void main(String args[])
 {
	float  TSA ,r,h,pi=3.14f;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter radius of Cylinder:");
	r = sc.nextFloat();
	System.out.print("Enter Hight of Cylinder:");
	h = sc.nextFloat();
	TSA = 2* pi* r*( r + h);  
	System.out.println("Total surface area of cylinder:"+TSA);
	sc.close();
}
}