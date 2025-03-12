package com.akib.finalstring_programs;
/*
 WAP to accept a string and display the potential value of string
        Input: Apple is good.  1+16+16+12+5      9+19   7+15+15+4	
		output: 50 28 41
		(A/a=1 upto Z/z=26) 
 */
public class Q44 
{  
    public static String displayPotential(String str)
    {   
    	str=str.toLowerCase();
    	int sum=0;
    	String res="";
    	for(int i=0;i<str.length();i++)
    	{    
    		char ch=str.charAt(i);
    		if(ch>='a' &&ch<='z')
    		{   
    			sum += ch - 96;
    			res += sum+" ";
    		}
    		else
    		{
    			sum = 0;
    		}
    	}
    	
    	
    	return res;
    }
	public static void main(String args[])
	{
		String str ="Apple is good";
		String words[]=str.split(" ");
		for(int i=0;i<words.length;i++)
		{
			System.out.print(words+" ");
		}
		String result = displayPotential(str);
		System.out.println(result);
	} 
}
