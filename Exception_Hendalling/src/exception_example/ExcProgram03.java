
package exception_example;

import java.util.Scanner;

public class ExcProgram03
{
    public void addLogic(int a,int b)
    {
    	if( a<0 || b<0 )
    	{
    		throw new IllegalArgumentException("don't pass the -v values..");
    	}
    	else
    	{
    		int c = a+b;
    		System.out.println("Addition of a & b :"+c);
    	}
    }
    public static void main(String args[])
    {
    	Scanner scan = new Scanner(System.in);
    	System.out.print("Enter value of a:");
    	int a = scan.nextInt();
    	System.out.print("Enter value of b:");
    	int b = scan.nextInt();
    	ExcProgram03 exampleObj = new ExcProgram03();
    	exampleObj.addLogic(a, b);
    	try
    	{
    		exampleObj.addLogic(a, b);
    	}
    	catch(IllegalArgumentException e)
    	{
    		System.out.println(e.getMessage());
    	}
    	scan.close();
    }
}
