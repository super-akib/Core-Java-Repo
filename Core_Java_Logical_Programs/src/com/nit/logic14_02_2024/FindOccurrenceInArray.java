package com.nit.logic14_02_2024;

import java.util.Scanner;

public class FindOccurrenceInArray 
{
    public static void findOcurrence(int a[],int key)
    {  
    	int count = 0;
		for(int i=0;i<a.length;i++)
		{
		 	if(key==a[i])
		 	{
		 		count++;
		 	}
		}
		System.out.println(key+" Occurred "+count+" times");
    }
   
	public static void main(String[] args)
	{
		int num[] = new int [5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array elements:");
		for(int i=0;i<num.length;i++)
		{
			num[i]= sc.nextInt();
		}
		System.out.print("Enter number :");
		int key = sc.nextInt();
		findOcurrence(num, key);
		sc.close();
	}

}
