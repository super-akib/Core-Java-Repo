package Nov9_Day8;
import java.util.Scanner;
 class TwoDigitsSum{
	public static int getSumOfDigits(int num)
	{
		return (num%10)+(num/10);
	}
}
public class ELCMain {
 public static void main(String args[])
 {
	 int n,result;
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Enter a two digit number:");
	 n = sc.nextInt();
	 result = TwoDigitsSum.getSumOfDigits(n);
	 System.out.println("Two Digit integer Sum is:"+result);
	 sc.close();
 }
}
