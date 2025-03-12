package nov11_LabDay12;
import java.util.Scanner;
public class SecondsConversionUsingSwitch {

	public static void main(String[] args) {
		double sec;
		int option;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Seconds:");
		 sec = sc.nextDouble();
		System.out.println("Please select below options to convert seconds to.");
		System.out.println("1)Days.");
		System.out.println("2)Hours.");
		System.out.println("3)Minutes.");
		System.out.print("Select your Option:");
		 option = sc.nextInt();
		switch(option)
		{
		  case 1: 
		         System.out.println(sec+"seconds is equal to "+sec/3600/24+" days.");
		         break;
		  case 2: 
			     System.out.println(sec+"seconds is equal to "+sec/3600+" hours.");
		         break;
		  case 3:
			     System.out.println(sec+"seconds is equal to "+sec/60+" minutes.");
		         break;
		  default :
			       System.out.println("Invalid Option please select only 1 to 3 options.");
			       break ;
		}
		sc.close();
	}
}
