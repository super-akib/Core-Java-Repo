package nov27_Lab;
import java.util.Scanner;
public class BLCCircle {

	public static void main(String[] args) {
	 
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number:");
		double radius = scan.nextDouble();
		System.out.println("The area of circle is:"+Circle.getArea(radius));
		scan.close();
		}

}
