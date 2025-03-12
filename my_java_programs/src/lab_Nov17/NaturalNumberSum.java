package lab_Nov17;
import java.util.Scanner;
public class NaturalNumberSum {

	public static void main(String[] args) {
		int num,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number:");
		num = sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			sum +=i;	
		}
      System.out.println("The Sum of First Hundred Natural :"+sum);
      sc.close();
	}

}
