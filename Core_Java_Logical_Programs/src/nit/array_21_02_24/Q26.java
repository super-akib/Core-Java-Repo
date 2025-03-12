package nit.array_21_02_24;

import java.util.Scanner;

public class Q26 
{
     public static int findOccurrence(String str, String word)
     {   
    	 int count= 0;
    	 String words[] = str.split(" ");
    	 for(int i=0;i<words.length;i++)
    	 {   	
    		 //String r = words[i];
      		   if(word.equalsIgnoreCase(words[i]))
    		   {   
      			   count++;
    		   } 
    	 }
    	 return count;
     }
     public static void main(String args[])
     {
    	 String str="Write Once Run Anywhere write";
    	 Scanner sc = new Scanner(System.in);
    	 System.out.print("Enter word we want to search:");
    	 String word = sc.next();
    	 int count = findOccurrence(str, word);
    	 if(count>0)
    	 {
    		 System.out.println(word+" occurred "+count+" times");
    	 }
    	 else
    	 {
    		 System.err.println(word+" is not present.");
    	 }
    	 sc.close();
     }
     
}
