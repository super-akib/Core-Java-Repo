package Day9_Nov10;
import java.util.Scanner;
public class MainNeonNumber {
  public static void main(String args[])
  {
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter a number:");
	  int num = sc.nextInt();
	  boolean result = LogicNeonNumber.isNeonNumber(num);
	  if(result)
		    System.out.println(num+" is Neon number.");
	  else
		  System.out.println(num+" is not a Neon number.");
	  sc.close();
  }
}
