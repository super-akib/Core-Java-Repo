package prime;
import java.util.Scanner;
public class PrimeSum {
  
	public static int getPrimeSum(int num)
	{
		int sumOfPrime=0;
		for(int i=2;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.println(i);
				sumOfPrime += i;
			}
		}
		return sumOfPrime;
	}
	public static void main(String args[])
	{
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Enter a number:");
	    int number = scan.nextInt();
	    System.out.println(getPrimeSum(number));
	    scan.close();
	    
	}
}
