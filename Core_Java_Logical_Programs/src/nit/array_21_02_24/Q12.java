package nit.array_21_02_24;

public class Q12 
{
    public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "java";
		boolean result= s1.equals(s2);
		
		if(result == true)
		{
			System.out.println("String objects are identical");
		}
		else
		{
			System.out.println("String objects are not identical");
		}
	}
}
