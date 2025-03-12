package method_overloading;

public class PrintNumber 
{
    public void diffrentDataType(int num)
    {
    	System.out.println("Integer:"+num);
    }
    
    public void diffrentDataType(long num)
    {
    	System.out.println("Long Integer:"+num);
    }
    public void diffrentDataType(float num)
    {
    	System.out.println("Float :"+num);
    }
    public void diffrentDataType(double num)
    {
    	System.out.println("Double :"+num);
    }
    public void diffrentDataType(char ch)
    { 
    	System.out.println("Char:"+ch);
    }
    public void diffrentDataType(String str)
    {
    	System.out.println("String:"+str);
    }
}
