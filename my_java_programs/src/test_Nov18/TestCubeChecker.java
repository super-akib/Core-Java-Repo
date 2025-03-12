package test_Nov18;
import java.util.Scanner;
public class TestCubeChecker {
  public static void main(String []args)
  {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number:");
	int num = sc.nextInt();
	System.out.println("The Cube root of number is:"+CubeChecker.isCube(num));
	sc.close();
  }
}
