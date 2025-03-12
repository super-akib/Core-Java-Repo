package Day6_Lab;
import java.util.Scanner;
public class ChechAlphabetOrNot {
public static boolean CheckAlpha(char ch)
{
	if((ch>='A'&& ch<='Z')||(ch>='a'&&ch<='z'))
	{
		return true;
	}
	else 
	{
		return false;
	}
}
public static void main(String args[])
{
	char alpha;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter alphabet:");
	alpha = sc.next().charAt(0);
	boolean res = CheckAlpha(alpha);
	if(res)
	{
		System.out.println("It is Char");
	}else
	{
		System.out.println("It is not a Char");
	}
	sc.close();
	
}
}
