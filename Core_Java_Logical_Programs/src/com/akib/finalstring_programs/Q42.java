package com.akib.finalstring_programs;
/*
 Q42) WAP to input a string and encrypt it  Ceaser-Chipher mode.
      Rotate each charactor by 13 places.
      input: Apple a day keeps the doctor away
      Output: NCCyr n ...
 */
public class Q42
{
    public static void main(String[] args)
    {
	   String str ="APPLE ";  //a day keeps the doctor away
	   char []ch = str.toCharArray();
	   String chipher="";
	   for(int i=0;i<ch.length;i++)
	   {
		   ch[i]+=13;
		   chipher += ch[i];
			 
	   }
	   System.out.println(chipher);
	}
}
