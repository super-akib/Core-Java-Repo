package lab_Nov17;
import java.util.Scanner;
public class TableGivenNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int num = sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println((i*num));
		}
     sc.close();
	}

}
