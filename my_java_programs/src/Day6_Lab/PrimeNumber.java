package Day6_Lab;
import java.util.Scanner;
public class PrimeNumber {
    public static boolean IsPrime(int num)
    {   
    	int c=0;
    	for(int i=1;i<num/2;i++)
    	{
    		if(num%i==0)
    		{
    			c++;
    		}
    	}
    	if(c==1)
    	{
    		return true;
    	}else 
    	{
    		return false;
    	}
    }
	public static void main(String[] args) {
	 int n;
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Enter a number:");
	 n = sc.nextInt();
	 boolean result = IsPrime(n);
	 System.out.println(result);
    sc.close();
	}

}
