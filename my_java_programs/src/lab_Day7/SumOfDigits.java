package lab_Day7;
import java.util.Scanner;
public class SumOfDigits {
	public static void main(String[] args) {
		int n,sum;
	    // Create a Scanner object to read input from user
		Scanner sc = new Scanner(System.in);
	    // Prompt the user to enter a number
		System.out.print("Enter two digit number:");
	    n = sc.nextInt();
	    // implement the logic according to conditions
	        sum =(n/10)+(n%10);
	        if(n<0)
	        {
	            System.out.println(-3);
	        }
	        else if(n>99)
	        {
	            System.out.println(-2);
	        }else if(n>=0 && n<=9)
	        {
	            System.out.println(-1);
	        }else
	          System.out.println("Addition of Two digit number:"+sum);  
	        
	        // Close the Scanner
	        sc.close();
	    }
	}


