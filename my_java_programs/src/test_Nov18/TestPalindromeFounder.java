package test_Nov18;
import java.util.Scanner;
public class TestPalindromeFounder {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number:");
    int num = sc.nextInt();
 
    System.out.println(PalindromeFounder.isPalindrome(num));
    sc.close(); 
	}

}
