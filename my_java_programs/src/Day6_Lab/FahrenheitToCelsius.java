package Day6_Lab;
import java.util.Scanner;
public class FahrenheitToCelsius {
 public static void main(String args[])
 {
	float c ,f;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Fahrenheit:");
	f = sc.nextFloat();
	c = (f-32)*5/9;
	System.out.println("Celsius is :"+c);
	sc.close(); 
 }
}
