package monthly_buget_calculation;

import java.util.Scanner;

public class Test 
{
  public static void main(String[] args) 
  {
	   Scanner scan = new Scanner(System.in);
	   System.out.print("Enter monthly Salary:");
	   double salary = scan.nextDouble();
	   
	   CalculateMonthlyBuget.calculateMonthlyBuget(salary);
	   scan.close();
  }
}
