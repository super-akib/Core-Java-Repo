package prime;
import java.util.Scanner;
public class PrintPrimeNumber {
   
	public static String getPrimeNumber(int start ,int end)
	{
		if(start > end )
		{
			int temp=start;
			    start = end;
			    end = temp ;
		}
		
		  int countFactor = 0;
		  String str="";
		  for(int i=start;i<=end;i++)
		   {
			  countFactor = 0;
			 for(int j = 1;j<=i;j++)
			  {
				if(i%j==0)
				{
					countFactor++;
					
				}
		   	}
			if(countFactor == 2)
			{
				str += i+" ";
			}		
		   }
		 return str;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Starting Point Of Prime Number:");
		int startNumber = scan.nextInt();
		System.out.print("ending Point of Prime Number:");
		int endNumber = scan.nextInt();
		String result = getPrimeNumber(startNumber,endNumber);
		System.out.println(result);
		scan.close();
	}

}
