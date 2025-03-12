package Day9_Nov10;
import java.util.Scanner;
public class MainAdamNumber {
  public static void main(String args[])
  {
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter a number:");
	  int num = sc.nextInt();
	  boolean result = AdamNumber.isAdamNumber(num);
	  if(result)
		  System.out.println("The "+num+" is AdamNumber.");
	  else 
		  System.out.println("The "+num+" is Not a AdamNumber.");
	  sc.close();
  }
}
