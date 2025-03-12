package nit.array_21_02_24;

import java.util.Scanner;

/*
 WAP to accept a string and display whether it is unique or not . A unique string is a string if none 
 of  the letters in string is repeated.
 */
public class Q27 
{    
	  public static void findUniqueString(String str)
	  {   
		  int count=0;
		  for(int i=0;i<str.length();i++)
		  {
			  for(int j=i+1;j<str.length()-1;j++)
			  {
				  if(str.charAt(i)== str.charAt(j+1))
				  {
					  count++;
				  }
			  }
		  }
		  if(count == 0)
		  {
			  System.out.println(str+" :is unique string");
		  }
		  else
		  {
			  System.out.println(str+" : is not unique string");
		  }
	  }
      public static void main(String args[])
      {
    	  Scanner sc = new Scanner(System.in);
    	  System.out.print("Enter a string: ");
    	  String str = sc.next();
    	  findUniqueString(str); 
    	  sc.close();
      }
}
