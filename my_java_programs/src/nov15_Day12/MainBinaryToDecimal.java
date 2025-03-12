package nov15_Day12;
import java.util.Scanner;
public class MainBinaryToDecimal {

	public static void main(String[] args) {
	 int n;	
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Enter Binary number:");
	  n = sc.nextInt();
	 System.out.println("The Decimal Number is:"+BinaryToDecimalConverter.toDecimal(n));
	 sc.close();
	}

}
