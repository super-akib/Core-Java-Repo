package Day6_Lab;
import java.util.Scanner;
public class CompoundIntrest 
{
   public static void main(String[] args) 
	{
		float Pamt,amt,rate;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter principle amount:");
		Pamt = sc.nextFloat();
		System.out.print("Enter rate of Interst:");
		rate = sc.nextFloat();
		amt=Pamt*((1+rate/100)*(1+rate/100)*(1+rate/100));
		System.out.println("Thre 3 years Compound Interest is:"+amt);
		sc.close();
	}
}
