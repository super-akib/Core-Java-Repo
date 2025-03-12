package Nov9_Day8;
import java.util.Scanner;
public class FindFactorsOfNumber {

	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number:");
		number = sc.nextInt();
		MethodOfFindFactors.printingFactors(number);
		sc.close();
	}

}
