package Nov16;
import java.util.Scanner;
public class MainCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		char operator;
		System.out.print("Enter 1st Number:");
		num1 = sc.nextInt();
		System.out.print("Enter 2nd Number:");
		num2 = sc.nextInt();
		System.out.print("Enter Operator:");
		operator = sc.next().charAt(0);
		System.out.println("Calculation is :"+LogicCalculator.calculator(num1, num2, operator));
		sc.close();
		
	}

}
