package com.nit.logic13_02_2024;

import java.util.Scanner;

public class DaigonalMatrixSum 
{  public static void daigonalElementsSum(int arr[][])
   {
	    int sum1 = 0;
	    int sum2 = 0;
	    for(int i=0;i<arr.length;i++)
	    {
	    	for(int j=0;j<arr[0].length;j++)
	    	{
	    		System.out.print(arr[i][j]+" ");
	    	}
	    	System.out.println();
	    }
	    for(int i=0;i<arr.length;i++)
	    {
	    	for(int j=0;j<arr[0].length;j++)
	    	{
	    		if(i==j )//left diagonal sum
	    		{
	    			sum1 += arr[i][j];
	    		}
	    	    if(i+j== arr.length-1)//right diagonal sum
	    		{
	    			sum2 += arr[i][j];
	    		}
	    	}
	    }
	    System.out.println("left diagonal sum:"+sum1);
	    System.out.println("Right diagonal sum:"+sum2);
   }
   public static void main(String[] args)
   {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter rows we want to:");
	    int row = sc.nextInt();
	    System.out.print("Enter columns we want to:");
	    int column= sc.nextInt();
	    int arr[][] = new int [row][column];
	    System.out.println("Enter "+(row*column)+" matrix Elements:");
	    for(int i=0;i<row;i++)
	    {
	    	for(int j=0;j<column;j++)
	    	{   
	    		System.out.print("element["+i+","+j+"]:");
	    		arr[i][j]= sc.nextInt();
	    	}
	    }	
	    daigonalElementsSum(arr);
	    sc.close();
   }
}
