package com.nit.array_example;

import java.util.Scanner;

//WAP to store marks of student in 6 different  subjects and display its total marks and percentage
public class ReportCard 
{
	public static void findTotal(int sub[])
	{   
		int totalmarks =0;
		for(int i =1 ; i<=sub.length;i++)
		{
			totalmarks += sub[i];
		}
		System.out.println("Total marks:"+totalmarks);
	}
	
    public static void main(String[] args) {
		
    	int subject[] = new int[6];
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter Subject Marks:");
    	for(int i = 1; i<=subject.length; i++)
    	{
    		System.out.print("Subject"+i+":");
    		subject[i]= sc.nextInt();
    	}
    	
    	findTotal(subject);
    	sc.close();
	}
}
