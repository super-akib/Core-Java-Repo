package nit.array_21_02_24;

import java.util.Scanner;

/*
  input : JaVa Is gooD
  output: jAvA iS GOOd
  */
public class Q22
{   
	
	public static String caseChanger(String str)
	{   
		String r = "";
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch >= 'A' && ch<='Z')//convert lower case
			{
				ch+=32;  // ch = (char)(ch+32)
				r += ch;
			}
			else if(ch>='a' && ch<= 'z') //convert lower to upper case
			{
				ch -=32;
				r+=ch;
			}
			else//empty spaces are store 
			{
				r +=ch;
			}	
		}
		return r;
	}
    public static void main(String[] args) {
	    
    	//String str ="JaVa Is gooD";
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Enter a mixed case String:");
    	String str = scanner.nextLine();
    	String result = Q22.caseChanger(str);
    	System.out.println(result);
    	scanner.close();
	}
}
