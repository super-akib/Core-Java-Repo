package Nov9_Day8;
import java.util.Scanner;
class NextMultipleOfHundred{
	public static int getNextMultipleOfHundred(int num)
	{
		return ((num/100)+1)*100;
	}
}
public class MainMultiple100 {
 public static void main(String args[])
 {
	 int number,result;
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Enter a Number:");
	 number = sc.nextInt();
	 result = NextMultipleOfHundred.getNextMultipleOfHundred(number);
	 System.out.println("Next Multiple of Number is :"+result);
	 sc.close();
 }
}
