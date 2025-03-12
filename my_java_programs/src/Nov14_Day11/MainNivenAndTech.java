package Nov14_Day11;
import java.util.Scanner;
public class MainNivenAndTech {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
	    if(NivenAndTechNumbersLogic.isNivenNumber(n))
	        System.out.println("The number is Niven number");
	    else if(NivenAndTechNumbersLogic.isTechNumber(n)) 
	        System.out.println("The number is Tech number");
	    	else
	         System.out.println(" Not a Tech and Niven number.");
	      
		sc.close();

	}

}
