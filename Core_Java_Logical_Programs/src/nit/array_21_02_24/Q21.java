package nit.array_21_02_24;

import java.util.Scanner;

public class Q21 
{     
	 public static String replaceOldCharacter(String str,char o , char n)
	 {
		 String r = "";
		 for(int i=0;i<str.length();i++)
		 {
			 char ch = str.charAt(i);
			 if(ch==o){  
				 //new character insert into char variable
				 ch = n;
				 r += ch;
			 }
			 else {
			       r += ch;
			 }
		 }
		 return r;
	 }
      public static void main(String[] args) 
      {
    	Scanner sc = new Scanner(System.in);
    	//System.out.println("Enter string :");  
		//String  str= sc.nextLine();
    	String str="j*v*";
		System.out.println("Orignal string:"+str);
		
		System.out.print("Enter old character:");
		char oldCharacter = sc.next().charAt(0);
		System.out.print("Enter new charector:");
		char newCharacter =sc.next().charAt(0);
		
		String result= Q21.replaceOldCharacter(str, oldCharacter, newCharacter);
		System.out.println(result);
		sc.close();
	  }
}
