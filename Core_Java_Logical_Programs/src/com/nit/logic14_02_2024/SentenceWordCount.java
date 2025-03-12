package com.nit.logic14_02_2024;
//IQ  
public class SentenceWordCount
{
    public static void main(String[] args) 
    {
		String str = "Practice java daily";
		String words[] = str.split(" ");
		char ch[] = str.toCharArray();
		int count=0;
		if(ch[0]!=32)
			count=1;
		for(int i=0;i<ch.length-1;i++)
		{
			if(ch[i]==' '&& ch[i+1]!=32)
			{
				count++;
			}
		}
		System.out.println("Number of words is:"+count);
		for(String w:words)
		{
			System.out.println(w);
		}
	}
}
   