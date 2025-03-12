package exception_hendalling;

public class StackOverFlowErrorDemo
{
	
	public static void main(String args[])
	{
		StackOverFlowErrorDemo d1 = new StackOverFlowErrorDemo();
		d1.display();
	}
	public void display()
	{
	System.out.println(" I am StackOverFlow");
	display();
	}
}
