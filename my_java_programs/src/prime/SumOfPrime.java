package prime;
import java.util.Scanner;
public class SumOfPrime {
    
	public static int getPrimeSum(int num)
	{    
		int count,sum =0,j,c2=0;
		for(int i=1 ;;i++)
		{
			count =0;
			for( j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count == 2)
			{   
				c2++;
				System.out.print(i+" ");
				sum = sum+i;
			}
			if(c2==num)
				break;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number:");
		int number = scan.nextInt();
		System.out.println("\nSum of Prime number:"+getPrimeSum(number));
		scan.close();

	}

}
