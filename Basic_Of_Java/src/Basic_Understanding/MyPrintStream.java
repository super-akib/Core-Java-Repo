package Basic_Understanding;

public class MyPrintStream {

	public void println(String message)
	{
		print(message);
		nextLine();
	}
	
	public void print(String message)
	{
		for(char ch : message.toCharArray())
		{
			System.out.print(ch);
		}
	}
	
	public void nextLine()
	{
		System.out.println("\n");
	}
}
