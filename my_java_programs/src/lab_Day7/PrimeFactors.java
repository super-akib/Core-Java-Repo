package lab_Day7;
import java.util.Scanner;
public class PrimeFactors {
 public static String primeFactors(int num)
 {  if(num<0)
    {
	   return "false" ;
    }else
     {	
	   String str ="";
	   for(int i=2;i<=num/2;i++)
	   {
		if(num % i == 0)
		{   
			int flag=0;
			for(int j=2 ;j<=i;j++)
			{
				if(i%j==0)flag++;
			}
			if(flag<2) str += i +" ";
		}
	  }
	return str;
	}
 }
 public static void main(String args[])
 {
	 int n;
	 Scanner num = new Scanner(System.in);
	 System.out.print("Enter an number:");
	 n = num.nextInt();
	 System.out.println(primeFactors(n));
	 num.close();
 }
}
