package nit.array_21_02_24;
import java.util.Scanner;
public class Q27OtherLogic
{     
	  public static void findUnique(String str)
	  {
		  int count = 0;
		  char ch[] = str.toCharArray();
		  for(int i=0;i<ch.length;i++)
		  {
			  char c = ch[i];
			  for(int j=i+1;j<ch.length;j++)
			  {
				  if(c == ch[j])
				  {
					  count++;
					  break;
				  }
			  }
		  }
		  if(count>0)
		  {
			  System.out.println(str+" :is not unique");
		  }
		  else
			  System.out.println(str+" :is unique");
	  }
      public static void main(String[] args) {
		   
    	  Scanner sc  = new Scanner(System.in);
    	  System.out.print("Enter a String:");
    	  String str = sc.nextLine();
    	  findUnique(str);
    	  sc.close();
	  }
}
