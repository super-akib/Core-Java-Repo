package Nov13_Day10;
import java.util.Scanner;
public class HappyNumber {
  public static boolean isHappyNumber(int num)
  {
	  int sum=0;
	  while(num!=0)
	  {
		  sum += Math.pow(num%10, 2);
		  num /=10;
		  if(sum > 9 && num==0)
		  {
			  num = sum ;
			  sum = 0 ;
		  }
		  else if(sum != 1 && num == 0)
		  {
			  return false;
		  }
	  }
	  return sum == 1;
  }
  public static void main(String[] args)
  {
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Enter a number:");
	 int number = sc.nextInt();
	 boolean res = isHappyNumber(number);
	 if(res)
		 System.out.println(number+" is Happy Number...");
	 else
		 System.out.println(number+" is Unhappy Number...");
	 sc.close();
  }
}
