package Day9_Nov10;
import java.util.Scanner;
public class MainDecriesingOrderRihghtTriangle {
   public static void main(String args[])
   {
	   Scanner pattern = new Scanner(System.in);
	   System.out.print("Enter a number:");
	   int number = pattern.nextInt();
	   LogicRightTringle.patternPrinter(number);
	   pattern.close();
   }
}
