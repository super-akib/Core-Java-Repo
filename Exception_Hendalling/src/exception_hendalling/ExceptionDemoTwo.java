package exception_hendalling;

public class ExceptionDemoTwo 
{
    public static void main(String args[])
    {
    	ExceptionDemoTwo exceptionDemoTwo = new ExceptionDemoTwo();
    	exceptionDemoTwo.checkException();
    }
    public void checkException()
    {
    	try
    	{
    		int number = Integer.parseInt("XYZ");
    		System.out.println("Result: "+number);
    	}
    	catch(NumberFormatException e)
    	{
    		System.out.println("Number Format Exception is Raised...");
    	}
    }
}
/*
 * Output: (Runtime Exception is Occurs)
 * Error Message:(Number Format Exception is Raised...)
 * */
