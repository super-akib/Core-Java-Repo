package FabonacciSeriesProgram;
import java.util.Scanner;
public class FebonacciNumberFactorialSum {
   
	public static void getFabonacciSiries(int num)
	{
		int num1=0 ,num2=1,temp=0;
		while(num!=0)
		{
			temp = num1+num2;
			num1 = num2;
			num2 = temp;
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number:");
		int number = scan.nextInt();
		getFabonacciSiries(number);
        scan.close();
	}

}
