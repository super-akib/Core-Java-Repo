package exception_hendalling;

public class ExceptionDemoThree 
{
    public static void main(String args[])
    {
    	ExceptionDemoThree exceptionDemoThree = new ExceptionDemoThree();
    	exceptionDemoThree.checkException();
    }
    public void checkException()
    {
    	try
    	{
    		String str = "Hello World";
    		System.out.println(str.length());
    		char ch = str.charAt(0);
    		ch = str.charAt(40);
    		System.out.println(ch);
    	}
    	catch(StringIndexOutOfBoundsException e)
    	{
    		System.out.println("String Index Out Of Bounds Exception !");
    	}
    }
}
/*
 * Output : Length of the String is print (11)
 * And is throws Exception (String Index Out Of bound exception)
 * */
