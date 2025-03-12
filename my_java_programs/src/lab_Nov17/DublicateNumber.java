package lab_Nov17;
import java.util.Scanner;
public class DublicateNumber {
   public static String getDuplicates(int num)
   {String str = "";
   int temp = num;
   while (num != 0) {
       int r1 = num % 10;
       num /= 10;
       int c = 0;
       while (temp != 0) {
           if (r1 == temp % 10) {
               c++;
           }
           temp /= 10;
       }
       if (c >1) {
           str += r1 + " ";
       }
   }
   return str;
   }
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Enter a number:");
	 int num = sc.nextInt();
	 System.out.println(getDuplicates(num));
	 sc.close();

	}

}
