package Day6_Lab;
import java.util.Scanner;
public class CalaculateCurveSusrfaceAreaOfcube {
 public static void main(String args[])
 {
	 float SA, Sq;
	 Scanner cube = new Scanner(System.in);
	 System.out.print("Enter side of square:");
	 Sq = cube.nextFloat();
	 SA = 6*Sq;
	 System.out.println("Curve of Surface area of cube is:"+SA);
	 cube.close();
 }
}
