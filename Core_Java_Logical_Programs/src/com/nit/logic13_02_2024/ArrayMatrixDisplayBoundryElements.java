package com.nit.logic13_02_2024;

import java.util.Scanner;

public class ArrayMatrixDisplayBoundryElements 
{
    public static void displayBoundryElements(int arr[][])
    {
    	System.out.println("Boundry Elements of an matrix is:");
    	for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				if(i==0|| j==0 || i== arr.length-1 || j==arr[0].length-1 )
				{
					System.out.print(arr[i][j]+" ");
				}
				else
				{
					System.out.print("   ");
				}
			}
			System.out.println();
		}
    }
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter row we want to:");
		int row = scan.nextInt();
		System.out.print("Enter column we want to:");
		int column = scan.nextInt();
		
		int matrix[][] = new int[row][column];
		System.out.println("Enter matrix Elements:");
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print("element["+i+","+j+"]:");
				matrix[i][j] = scan.nextInt();
			}
		}
		
		displayBoundryElements(matrix);
		scan.close();
	}
	
}
