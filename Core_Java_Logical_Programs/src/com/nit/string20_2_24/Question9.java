package com.nit.string20_2_24;
//WAP to convert lower case character to upper case
public class Question9 
{
   public static void main(String[] args)
   { 
	   String str1= "java";
	   String r ="";
		 for(int i=0;i<str1.length();i++)
		 {
			 char ch = str1.charAt(i);
			 if(ch>= 'a'&& ch<='z') 
			 {
				 r += (char)(ch-32);
			 }
			 else
			 { 
				 r+=ch;
			 }
		 }
		 System.out.println("Orignal:"+str1);
		 System.out.println("After converting to lower-case:"+r);
	
   } 
}
