package nov23_Lab;
import java.util.Scanner;
public class TestMonkeyTrouble {

	public static void main(String[] args) {
		boolean aSmile,bSmile,result;	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter true if A-Monkey is smiling. else enter false");
        aSmile = scan.nextBoolean();
        System.out.println("Enter true if B-Monkey is smiling. else enter false");
        bSmile = scan.nextBoolean();
        result = MonkeyTrouble.monkeyTrouble(aSmile, bSmile);
        if(result)
        	System.out.println("We are in Truble.");
        else
        	System.out.println("We are not in Truble.");
        scan.close();
	}

}
