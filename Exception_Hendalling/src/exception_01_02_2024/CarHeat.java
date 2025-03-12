package exception_01_02_2024;

public class CarHeat extends Exception
{
    public CarHeat(String errorMessage)
    {
    	super(errorMessage);
    }
    public static void heat(int celcieus)
    {
 	  try
 	  {
 		  if(celcieus >= 50)
 	      {
 		    throw  new CarHeat("Car engine is OverHeated..");
 	      }
 	      else
 	      {
 		    System.out.println("Car engine is not heat...");
 	      }
 	  }
 	  catch(CarHeat ch)
 	  {
 		  System.err.println(ch.getMessage());
 	  }
    }  
    
}
