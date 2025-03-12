package Nov9_Day8;
import java.util.Scanner;
public class MainArmstrong {
  public static void main(String args[])
  {
	  int n;
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter a number:");
	  n = sc.nextInt();
	  IsArmstrongNumber.printArmstrong(n);
	  sc.close();
  }
}
