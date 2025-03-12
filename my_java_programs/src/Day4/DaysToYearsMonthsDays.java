package Day4;
import java.util.Scanner;
public class DaysToYearsMonthsDays {

	public static void main(String[] args) {
	 int day ,year,month,days;
	 if(args.length==1) 
	 {
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Enter number of Days:");
	 days = sc.nextInt();
	 year = days/365;
	 month = (days % 365)/30;
	 day   =  (days % 365)%30;
	 System.out.println("Years:"+year);
	 System.out.println("Months:"+month);
	 System.out.println("Days:"+day);
	 sc.close();
	 }else System.out.println("Enter no.s of Days!");
	}
}