package exception_01_02_2024;
 
public class Handling 
{  
	    
   public  static void nit(int number)
   {
	   try
	   {
		   System.out.println("Naresh");
	       nit1(number);
	       System.out.println("I");
	   }
	   catch(Exception e)
	   {
		   System.err.println("Exception :"+e.getMessage());
	   } 
   }
   public static void nit1(int num)
   {
	   try
	   {  
		   if(num == 0 || num == 10)
		   {
			   throw new ArithmeticException(); 
		   }
		   else
		   {
			   System.out.println("Completed...");
		   }
	   }
	   catch(ArithmeticException e)
	   {
		   System.err.println("Exception divide by zero");
	   }
	   finally
	   {
		   System.out.println("Finally Executed...");
	   }
   }
}
