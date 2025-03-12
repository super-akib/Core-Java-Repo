package nov24_Lab;
import java.util.Scanner;
class BLCclass{
    public static int diff21(int n) {
    //Write your logic here....
    	if(n>21)
    		return (21-n)*2;
    	else
    		return 21-n;
    }
}
public class MyProgram {
 
	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a number:");
    int number = scan.nextInt();
    System.out.println("21 Difference is :"+BLCclass.diff21(number));
    scan.close();
	}

}
