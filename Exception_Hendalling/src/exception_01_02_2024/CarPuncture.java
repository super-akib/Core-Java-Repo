package exception_01_02_2024;

public class CarPuncture extends Exception
{
     public CarPuncture (String errorMessage)
     {
    	 super(errorMessage);
     }
     public static void puncture(String status)
     {
  	   try
  	   {
  		   if(status.equals("puncture"))
  	       {
  		    throw  new CarPuncture("Car is puncture..");
  	       }
  	       else
  	       {
  		     System.out.println("Car is not Puncture...");
  	       }
  	   }
  	   catch(CarPuncture cp)
  	   {
  		   System.err.println(cp.getMessage());
  	   }
     }
}
