package nov23_Lab;
import java.util.Scanner;
public class PowerOfTwoTest {

	public static void main(String[] args) {
	 
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a Number:");
		int num = scan.nextInt();
		if(VerifyPowerOfTwo.checkNumber(num))
		   System.out.println(num+" is power of 2");
		else 
			System.out.println(num+" is not power of 2");
		scan.close();
	}		
}
