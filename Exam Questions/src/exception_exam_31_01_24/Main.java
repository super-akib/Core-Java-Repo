package exception_exam_31_01_24;

import java.util.Scanner;

public class Main 
{
   public static void main(String args[])
   {   
	   
	   Scanner sc = new Scanner(System.in);
	   
	   try(sc)
	   {  
		   System.out.print("Enter Name of Product:");
		  String name =  sc.nextLine();
		  System.out.print("Enter Available Quntity:");
		  int available = sc.nextInt();
		  System.out.print("Enter price:");
		  double price = sc.nextDouble();
		  Product  p1 = new Product(name,available, price);
         
		  System.out.print("Enter quntity:");
		  int quntity = sc.nextInt();
		  p1.rocessOrder(quntity, 250000);
	   }
	   catch(Exception e)
	   {
		   System.err.println(e);
	   }
   }
}
