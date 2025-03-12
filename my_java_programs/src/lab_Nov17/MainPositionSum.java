package lab_Nov17;
import java.util.Scanner;
public class MainPositionSum {

	public static void main(String[] args) {
	 int number;
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Enter a number:");
	 number = sc.nextInt();
	 System.out.println("Even Position Sum:"+SumOddEvenDigit.getEvenPosSum(number));
	 System.out.println("Odd Position Sum:"+SumOddEvenDigit.getOddPosSum(number));
	 sc.close();

	}

}
