package exception_hendalling;

public class ExceptionDemo 
{
    public static void main(String args[])
    {
    	ExceptionDemo exceptionDemo = new ExceptionDemo();
    	exceptionDemo.checkException();
    }
    
    public void checkException()
    {
    	try
    	{
    		int num1 = 10, num2=0;
    		int operation = num1/num2;
    		System.out.println("Result:"+operation);
    	}
    	catch(Exception e)
    	{
    	    System.out.println("You shouldn't divide number by zero");	
    	}
    }
}
/*
 * Output :  (Runtime Error is Occurs)
 * You shouldn't divide number by zero
 * 
 * */
