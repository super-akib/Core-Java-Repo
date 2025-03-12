package lab_Day7;
//import required classes and packages
import java.util.Scanner;
public class PalindromeTest {
	public static void main(String[] args) {
		    int n ,result;
			// initialize Scanner object and read the number from user
			Scanner sc = new Scanner(System.in);
			//ask user to input the number
			System.out.print("Enter a number:");
			n = sc.nextInt();
			result = isPalindrome(n);
			if(result==1)
			{
			    System.out.println("the number is palindrome.");
			}else if(result==0)
			{
			  System.out.println("the number is not a palindrome.");  
			}else if(result==-2)
			{
			    System.out.println("this program can check the operation for the 3 number only.");
			}else
			{
			    System.out.println("Given number is -ve kindly provide +ve number only.");
			}
			sc.close();
		}
			public static int isPalindrome(int num)
	        {  
	          int rev =0,temp;
	          if(num>99 & num<1000)
		     	{
		     	    temp = num;
			     while(temp!=0)
	            {
	             rev = rev*10+temp%10;
	             temp /= 10;
	            }
	            if(rev==num)
	            {
	            return 1;
	            }else
	            {
	             return 0;
	            }
			    
			}else if(num<=0)
			{
			    return -1;
			}else
			{
			    return -2;
			}
		  }
	 }
