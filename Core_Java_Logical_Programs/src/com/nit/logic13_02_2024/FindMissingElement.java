package com.nit.logic13_02_2024;

import java.util.Arrays;
import java.util.Scanner;

public class FindMissingElement
{
	public static void findMisssingNumbers(int arr[])
	{ 
		System.out.println("\n-----------Missing-Elements-Are-----");
	 	for(int i=0;i<arr.length-1;i++)
	  	{  
	 		int num = arr[i+1]-arr[i];
	 		int count =1;
	 		while(num>1)
	 		{
	 			System.out.print( arr[i]+count+" ");
	 			count++;
	 			num--;
	 		}
	       		
	 	}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size:");
		int size = sc.nextInt();
		System.out.println("Enter "+size+" elements in array:");
		int arr[] = new int[size];
		for(int i=0; i<arr.length;i++)
		{
			System.out.print("element["+i+"]:");
			arr[i] = sc.nextInt();
		}
		System.out.println("Array elements are:");
		 Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		findMisssingNumbers(arr);
		sc.close();
	}

}
