package nov11_LabDay12;
import java.util.Scanner;
public class FindNumberIsUglyOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check ugly or not:");
		int num = sc.nextInt();
		if(num>0)
		{  
			
		   if(isUgly(num))
          {
        	System.out.println("Is Ugly.");
          }else
          {
        	System.out.println("Is Not a Ugly.");
          }
		}
		else
			System.out.println("Please Enter Only Positive number.");
          sc.close();
	}
	public static boolean isUgly(int n)
	{
		int count = 0, i;
		for(i=1;i<=n;i++)
		{   
			count = 0;
			if(n%i==0)
			{
				if(i==2 || i==3 || i==5)
				{
					count++;
					break;
				}
			}
		}
	  return (count>0)?true:false;	
	}

}
