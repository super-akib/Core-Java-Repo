package com.nit.amar;

import java.util.Scanner;

public class BinaryArray 
{    
	 //Check all 1s 
	 public static void chekBinaryArray(int[] a,int k)
	 {
		 int count=0;
		 for(int i=0;i<a.length-1;i++)
		 {
			if(a[i]!= a[i+1])
			{
				count++;
			}
		 } 
		 if(count>=k)
		 {
			 System.out.println("Ouput:"+true);
		 }
		 else
		 {
			 System.out.println("Output:"+false);
		 }
	 }
	 
     public static void main(String[] args)
     {   
    	 Scanner sc = new Scanner(System.in);
    	 System.out.print("Enter size of the Array:");
    	 int size = sc.nextInt();
		int b[] = new int[size];
		for(int i=0;i<b.length;i++)
		{   
			System.out.print("Element-"+i+":");
			b[i]= sc.nextInt();
		}
		System.out.print("Enter k value:");
		int k = sc.nextInt();
		
		chekBinaryArray(b, k);
		
		
		sc.close();
	}
}
