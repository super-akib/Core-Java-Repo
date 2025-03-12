package com.akib.finalstring_programs;
/*WAP to accept two string display the new string by taking each charactor of 
 * the first string from left to right
	    and of the second string from right to left 
		Input: s1="alpha";
		       s2="beta" 
	    output:  aaltpehba*/
public class Q41
{
    public static void margeTwoString(String s1,String s2)
    {
    	String result="";
    	
    	for(int i=0,j=s2.length()-1;(i<s1.length()|| i<s2.length()-1);i++,j--)
    	{   
    		result += s1.charAt(i);
    		if(j>=0)
    		{
    		 result += s2.charAt(j);	
    		}    		
    	}
    	System.out.println(result);
    }
	public static void main(String[] args) 
	{
		  String s1 = "alpha";//left to right
		  String s2 = "beta";// right to left
		  margeTwoString(s1, s2);
		  
	}
	
}
