package nit.string_handling;
/*WAP to find number of characters in a string  */
import java.util.Scanner;

public class CheckLengthOfString 
{
	public static int countCharecters(String str)
	{
		return str.length();
	}
    public static void main(String[] args)
    {   
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter text :");
		 String str = sc.nextLine();
		 if(countCharecters(str)>5)
		 {
			 System.out.println(str.toUpperCase());
		 }
		 else
		 {
			 System.out.println(str.toLowerCase());
		 }
		 sc.close();		 
	}
}
