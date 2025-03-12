package nit.array_21_02_24;
import java.util.Scanner;
/*  WAP to accept a string and display the number of lower-case the number  lower,upper,special*/
public class Q23 {
  		
  public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter String:");
			String str=sc.nextLine();

			int lCount=0,uCount=0,sCount=0,dCount=0;
			for(int j=0;j<str.length();j++)
			{
				char ch=str.charAt(j);
				
				if(ch>=48 &&  ch<=57)
				{
					dCount++;
				}
				else if(ch>='A' && ch<='Z')
				{
					uCount++;
				}
				else if(ch>='a' && ch<='z')
				{
					lCount++;
				}
				else
				{
					sCount++;
				}
			}
			System.out.println("Lower case character count :"+lCount);
			System.out.println("Upper case character count :"+uCount);
			System.out.println("Special character count :"+sCount);
			System.out.println("Digit count :"+dCount);
			sc.close();

		}

	}