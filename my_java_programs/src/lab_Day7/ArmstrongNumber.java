package lab_Day7;
import java.util.Scanner;
public class ArmstrongNumber {
public static void armsrtongNumber(int num)
{
	int sum=0,temp,count=0;
	temp= num;
	//count the digit length
	while(temp!=0)
	{
	  temp/=10;
	  count++;
	}
	temp= num;
	//main armstrong logic
	while(temp!=0)
	{
		int rem = temp%10;
		sum += Math.pow(rem,count);//153
		temp/=10;		
	}
	if(sum==num)//153==153
	{
		System.out.println(num+" ");
	}
}
public static void main(String args[])
{
	int n;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number:");
	n = sc.nextInt();
	for(int i=1;i<=n;i++)
	{
		armsrtongNumber(i);
	}
	
	sc.close();
}
}
