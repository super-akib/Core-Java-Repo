package Nov9_Day8;
import java.util.Scanner;
class SumOfRoundedValues
{
  	public static int sumOfRoundedValues(int num)
  	{    
  		return  (((num/10)+(num%10)/5)*10);   
  	}
}
public class MainRoundedNumber 
{
  public static void main(String args[])
  {
	  int n1,n2,n3,res;
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter a Three number:");
	  n1 = sc.nextInt();
	  n2 = sc.nextInt();
	  n3 = sc.nextInt();
	  res = SumOfRoundedValues.sumOfRoundedValues(n1)+SumOfRoundedValues.sumOfRoundedValues(n2)+SumOfRoundedValues.sumOfRoundedValues(n3);
	  System.out.println(res);
	  sc.close();
  }
}
