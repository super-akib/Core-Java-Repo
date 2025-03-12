package Nov9_Day8;
import java.util.Scanner;
public class MainDeffrance {
 public static void main(String args[])
 {
	 int number,result;
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Enter a Tow Digit number:");
	 number = sc.nextInt();
	 result = TwoDigitsDifference.getDiffOfDigits(number);
	 System.out.println("Th Differance of Two-digit number is:"+result);
	 sc.close();
	 
 }
}
