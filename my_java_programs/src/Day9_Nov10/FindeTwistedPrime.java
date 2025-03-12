package Day9_Nov10;
import java.util.Scanner;
public class FindeTwistedPrime {
 public static void main(String args[])
 {
	 int num;
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Enter a Number:");
	 num = sc.nextInt();
	 boolean res = TwistedPrime.isPrime(num);
	 if(res)
		 System.out.println("The number is Twisted prime.");
	 else 
		 System.out.println("The number is not Twisted Prime.");
	 sc.close();
 }
}
