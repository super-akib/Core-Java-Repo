package com.akib.collections_examples;

import java.util.HashMap;
import java.util.Scanner;

public class FindOccurrenceOfElements
{     
	  public static void findOccurrence(String str)
	  {
		  HashMap<Integer,Character>  hashMap = new HashMap<>();
		  int count;
		  
          for(int i=0;i<str.length();i++)
          {   
        	  count=1;
        	   for(int j=i+1;j<str.length()-1;j++)
        	   {
        		   if(str.charAt(i)==str.charAt(j))
        		   {
        			   count++;
        		   }
        	
        	   }
        	   if(count>0)
        	   {
        		   hashMap.put(count, str.charAt(i));
        	   }
          }
          System.out.println(hashMap);
	  }
      public static void main(String args[])
      {
    	  Scanner sc = new Scanner(System.in);
    	  String str = sc.nextLine();
    	  findOccurrence(str);
    	  sc.close();
      }
}
