package nov23_Lab;
import java.util.Scanner;
public class TestBLCcode {

	public static void main(String[] args) {
    
		//create a scanner object and read a number from user;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Natural number:");
        int num = sc.nextInt();
		//call calculateDifference() method by passing integer value and Print results
        System.out.println("The difference between Sum of Square \n and Square of Sum is:");
        System.out.println(SumOfTheSquaresAndSquareOftheSums.calculateDifference(num));
        
        // close scanner
        sc.close();
	}

}

