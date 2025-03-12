package com.nit.string20_2_24;

public class Question8
{
    public static void main(String[] args)
    {
		 String str1 = "JAVA";
//		 String str2 = str1.toLowerCase();
//		 System.out.println("Orignal:"+str1);
//		 System.out.println("After converting to lower-case:"+str2);
		 String r ="";
		 for(int i=0;i<str1.length();i++)
		 {
			 char ch = str1.charAt(i);
			 if(ch>= 'A'&& ch<='Z') 
			 {
				 r += (char)(ch+32);
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
