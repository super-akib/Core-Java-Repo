package nit.array_21_02_24;

public class Q16 
{
     public static void main(String[] args) {
		String str = "The poetry of earth is never dead.";
		String input ="the poetry";
		boolean result = str.startsWith(input);
		
		if(result == true)
		{
			System.out.println(str+" starts with "+input);
		}
		else
		{
			System.out.println(str+" doesnot starts withs "+input);
		}
	}
}
