package exception_01_02_2024;

public class CarStopped extends Exception
{
    public CarStopped(String errorMessage)
    {
    	super(errorMessage);
    }
    public static void stop(String status)
    {
 	   try {
 	   if(status=="stop")
 	   {
 		 throw  new CarStopped("Car is stopped");
 	   }
 	   else
 	   {
 		   System.out.println("Car still Running...");
 	   }
 	   }
 	   catch(CarStopped cs)
 	   {
 		   System.err.println(cs.getMessage());
 	   }
    }
}
