package Day6_Lab;
import java.util.Scanner;
public class CelsiusToFahrenheit 
{
 public static void main(String args[])
 {
	float C,F;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Temperature in Celsius:");
	C = sc.nextFloat();
	F=((9*C)/5)+32;
	System.out.println("Temperature in Fahrenheit is:"+F);
	sc.close();
	
 }
}
