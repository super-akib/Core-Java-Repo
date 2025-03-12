package Day6_Lab;
import java.util.Scanner;
public class Palindrome {
 public static boolean IsPalindrome(int num)
 {
	 int temp = num ,rev=0 ;
	 while(temp!=0)
	 {
		rev = rev*10+temp%10;
		temp /=10;
	 }
	 return rev==num;
 }
 public static void main(String args[])
 {
	int n;
	boolean res;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter number:");
	n = sc.nextInt();
	res = IsPalindrome(n);
	System.out.println(res);
	if(res)
	{
	System.out.println("Is palindrome.");
	}else 
	{
		System.out.println("Is not palindrome.");
	}
	sc.close();
 }
}
