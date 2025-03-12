package com.akib.string_builder;

public class ReversBasesOnWords 
{
      public static String reversWords(String str)
      {   
    	  String words[] = str.split(" ");
    	  StringBuilder sb = new StringBuilder();
    	  for(int i=words.length-1;i>=0;i--)
    	  {
    		   sb.append(words[i]+" ");
    		   //sb.append(" ");
    	  }
    	  return sb.toString().trim();
      }
      public static void main(String[] args)
      {
		   String str = "java programming is good for career";
		   System.out.println("Input:"+str);
		   System.out.println();
		   System.out.println("Output:"+reversWords(str));
   	  }
}
