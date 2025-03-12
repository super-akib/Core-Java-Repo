package nit.array_21_02_24;
//WAP  to find two string are identical or not using equalsIgnoreCase()
public class Q13 {

	public static void main(String[] args) {
		String s1 = "JavA";
		String s2 = "jAvA";
		boolean result= s1.equalsIgnoreCase(s2);
		
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
