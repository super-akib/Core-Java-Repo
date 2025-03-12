package exception_hendalling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleExceptionDemo 
{
   public static void main(String args[])
   {   
	   Scanner scan = new Scanner(System.in);
	   
	   try
	   {
		 System.out.print("Enter value of a:");
		 int a = scan.nextInt();
		 System.out.print("Enter value of b:");
		 int b = scan.nextInt();
		 System.out.println(a+" "+b);
	   }
	   catch(InputMismatchException e)
	   {   
		   System.out.println(e.toString());
		   System.out.println("Exception :"+e.getMessage());
		   e.printStackTrace();
		   
	   }
	   scan.close();
   }
}
