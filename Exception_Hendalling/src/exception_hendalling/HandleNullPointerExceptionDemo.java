package exception_hendalling;

public class HandleNullPointerExceptionDemo 
{
    public void display(String str)
    {  
       try
       {
    	System.out.println("Result:"+str);
       }
       catch(NullPointerException e)
       {
    	  System.out.println(e);   
       }
    }
    
    public static void main(String args[])
    {
    	HandleNullPointerExceptionDemo h= null;
    	if (h==null)
    	{
    	h= new HandleNullPointerExceptionDemo();
    	h.display("Hello");
    	}
    	else
    	{
    	h.display("World");
    	}
    }
}
