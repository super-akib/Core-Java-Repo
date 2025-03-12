package exception_exam_31_01_24;

public class AdvancedCalculator
{   int number;
    
    public AdvancedCalculator(int number)
    {
    	this.number = number;
    }
	public void performCalculation(String input)
	{
		try
		{
		   if(input == null)
		   {
			   throw new NullPointerException();
		   }
		   else
		   {
		      int lenght= input.length();
		      System.out.println("Lenght of String:"+lenght);
		      try
		      {
		    	  System.out.println(lenght/number);
		      }
		      catch(ArithmeticException e1)
		      {
		    	  System.err.println("Arithmetic Exception generted..");
		      }
		   }
	    }
		catch(NullPointerException e)
		{
			System.err.println("Null pointer Exception generated...");
		}
		
		
	}
	public static void main(String args[])
	{
		int number = Integer.parseInt(args[0]);
		AdvancedCalculator  ad = new AdvancedCalculator(number);
		ad.performCalculation("Akib");
	}
}
