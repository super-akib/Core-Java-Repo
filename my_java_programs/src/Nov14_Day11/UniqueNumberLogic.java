package Nov14_Day11;

import java.util.Scanner;

public class UniqueNumberLogic {
  public static String isUnique(int num)
  {   
	  String str="";
	  int temp,r;
	  while(num!=0)
	  {
		  r = num % 10;
		  temp = num;
		  int c =0 ;
		  while(temp!=0)
		  {   
			 if(r==temp%10)
			  {
				c++;
			  }
			  temp /= 10;
		  }
		  if(c==1)
			  str +=r +" ";
		  num /= 10;
		}
	  return str;
  }
  public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter a number:");
		 int num = sc.nextInt();
		 System.out.println(isUnique(num));
		 sc.close();

		}

}
