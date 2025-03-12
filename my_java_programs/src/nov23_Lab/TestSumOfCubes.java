package nov23_Lab;
import java.util.Scanner;
public class TestSumOfCubes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Digit:");
		int num = scan.nextInt();
		System.out.println("The three digit numbe Cubes Sum is :"+SumOfCubesOfDigits.findSum(num));
		scan.close();
	}

}
