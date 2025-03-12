package nov15_Day12;
import java.util.Scanner;
public class PyramideMain {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Enter number:");
		int  x = sc.nextInt();
		System.out.println(PiramedPatternLogic.drawPattern(x));
		sc.close();
	}

}
