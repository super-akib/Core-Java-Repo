package nov24_Lab;
import java.util.Scanner;
class ELCclass
{
	public static int sumDouble(int num1, int num2)
	{
		if(num1==num2)
			return (num1+num2)*2;
		else
			return num1+num2;
	}
}
public class DoubleSum {

	public static void main(String[] args) {
		int firstNumber,secondNumber;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a 1st-number:");
		firstNumber = scan.nextInt();
		System.out.print("Enter a 2nd-number:");
		secondNumber = scan.nextInt();
		System.out.println("Sum of Two or double sum is:"+ELCclass.sumDouble(firstNumber,secondNumber));
        scan.close();
	}

}
