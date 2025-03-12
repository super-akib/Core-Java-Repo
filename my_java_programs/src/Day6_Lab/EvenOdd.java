package Day6_Lab;
import java.util.Scanner;
public class EvenOdd {
    public static String CheckNum(int num)
    {
      if(num%2==0)
      {
    	  return "Even";
      }else
      {
    	  return "Odd";
      }
    }
	public static void main(String[] args)
	{
	   int n;
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Enter Digit:");
	   n = sc.nextInt();
	   String res = CheckNum(n);
	   System.out.println(res);
	   sc.close();
	}

}
