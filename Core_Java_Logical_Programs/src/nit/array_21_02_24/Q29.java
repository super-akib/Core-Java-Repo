package nit.array_21_02_24;

import java.util.Scanner;

/* 
 WAP to accept a String and display a new string by removing  all the duplicate characters of string
 input: america
 output: meric
 */
public class Q29 
{
     public static void removeDublicate(String str)
     {    
    	  char ch[] = str.toCharArray();
    	  String r="";
    	  
    	  for(int i=0;i<ch.length;i++)
    	  {   
    		  int count=0;
    		  for(int j=0;j<ch.length;j++)
    		  {
    			  if(ch[i] == ch[j])
    			  {   
    				 count++;
    			  }
       		  }
    		  if(count == 1)
    		  {
    			  r += ch[i];
    		  }
    		  
    	  }
    	  
    		  System.out.println("Orignal:"+str);
    		  System.out.println("After remove dublicate:"+r);
     }
     public static void main(String[] args)
     {
	      Scanner sc = new Scanner(System.in);
	      System.out.print("Enter a String :");
	      String str = sc.nextLine();
	      removeDublicate(str);
	      sc.close();
	 } 
}
