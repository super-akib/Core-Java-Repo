package nit.array_21_02_24;

import java.util.Scanner;

// print vowels present in string 
public class Q20
{     
	  public static char retunrVowel(char ch)
	  {
		  switch(ch)
		  {
		     case 'A':  return 'A';
		     case 'E':  return 'E';
		     case 'O':  return 'O';
		     case 'I':  return 'I';
		     case 'U':  return 'U';
		     default : return ' ';
		  }
	  }
      public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string:");
		String str = sc.nextLine();
		String c = str.toUpperCase();
		//for the counting purpose 
		//int aCount=0, eCount=0,iCount=0,oCount=0,uCount=0;
		
		for(int i=0;i<c.length();i++)
		{   
			char ch = c.charAt(i);
			if(ch == 'A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
			   
			}
		}
		
		sc.close();
	  }
}
