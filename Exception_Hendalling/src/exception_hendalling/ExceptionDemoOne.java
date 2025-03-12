package exception_hendalling;

public class ExceptionDemoOne 
{
    public static void main(String args[])
    {
    	ExceptionDemoOne d1 = new ExceptionDemoOne();
    	d1.checkException();
    }
    
    public void checkException()
    {
    	try
    	{
    		int a[] = new int [50];
    		a[6] = 20;
    		System.out.println(a[6]);
    	}
    	catch(ArrayIndexOutOfBoundsException e)
    	{
    		System.out.println("Array Index Out of Bound..");
    	}
    }
}
/*
 * Output:
 * Program run without abnormal condition
 * */
