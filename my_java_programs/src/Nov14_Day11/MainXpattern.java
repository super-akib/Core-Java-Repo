package Nov14_Day11;
import java.util.Scanner;
public class MainXpattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int n = sc.nextInt();
	    System.out.println(XpatternLogic.drawPattern(n));
		sc.close();
	}

}
