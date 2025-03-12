package Nov16;
import java.util.Scanner;
public class MainBuzzNumber {

	public static void main(String[] args) {
		int number;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter  a number:");
		number = scanner.nextInt();
	    if(BUZZNumberLogic.buzzNumber(number))
	    	System.out.println("The"+number+" number is Buzz Number");
	    else
	    	System.out.println("The "+number+" number is Not Buzz Number");
		scanner.close();

	}

}
