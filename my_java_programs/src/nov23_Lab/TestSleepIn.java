package nov23_Lab;
import java.util.Scanner;
public class TestSleepIn {
   public static void main(String args[])
   {
	   boolean weekday,vacation;
	   Scanner scan = new Scanner(System.in);
	   System.out.println("Enter true if it is a week day else enter false");
	   weekday = scan.nextBoolean();
	   System.out.println("Enter true you are on vacation else enter false");
	   vacation = scan.nextBoolean();
	   boolean result = SleepIn.sleepIn(weekday, vacation);
	   if(result)
		   System.out.println("We sleep in");
	   else
		   System.out.println("Not Sleeping . Hard working");
	   scan.close();
   } 
}
