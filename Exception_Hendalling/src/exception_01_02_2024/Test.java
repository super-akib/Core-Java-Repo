package exception_01_02_2024;

import java.util.Scanner;

public class Test
{
     public static void main(String []args)
     {
    	 Scanner scanObj = new Scanner(System.in);
    	   	 
    	 System.out.print("Enter parameter value:");
    	 int value = scanObj.nextInt();
    	 Handling.nit(value);
    	// Handling.nit1(value);
         scanObj.close();
     }
}
