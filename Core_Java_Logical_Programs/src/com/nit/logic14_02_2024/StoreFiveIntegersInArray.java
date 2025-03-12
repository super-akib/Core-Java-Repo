package com.nit.logic14_02_2024;

import java.util.Scanner;

public class StoreFiveIntegersInArray {

	public static void main(String[] args)
	{ 
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter "+arr.length+" integers in array");
		int sum = 0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]= sc.nextInt();
			sum +=arr[i];
		}
		
        System.out.println("\nSum of all Integers is:"+sum);
        sc.close();
	}

}
