package com.nit.logic12_02_2024;
import java.util.InputMismatchException;
import java.util.Scanner;

/*WAP to count number of zero in an array and shift  all the zeros to the */
public class SaprateZeroInArray 
{  
	public static void seprateZeros(int arr[])
	{
		int countZero = 0;
		int b[] = new int [arr.length];
		//counting number of zeros.
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				countZero++;
			}
		}
		System.out.println("No. of zeros is:"+countZero);
		//Loading zeros and non zeros separately
		for(int i=0,j=0;i<b.length;i++)
		{
			if(arr[i]==0)
			{
				b[j++]=arr[i];
			}
			else
			{
				b[countZero++]= arr[i];
			}
		}
		//fetch the b array elements and display 
		for(int i=0;i<b.length;i++)
		{  
			if(b[i]==b.length-1)
			{		
			  System.out.print(b[i]+" | ");
		    }
			else
			{
				System.out.print(b[i]+" ");
			}
		}
	}
    public static void main(String[] args)
    {
    	Scanner scan  = new Scanner(System.in);
        
    	
    	try(scan)
    	{
    		System.out.print("Enter size of array:");
            int size = scan.nextInt();
        
            int arr[] = new int[size];
            System.out.println("Enter "+size+" elements in array");
            for(int i=0;i<arr.length;i++)
            {
         	  System.out.print("element["+i+"]:");
        	  arr[i] = scan.nextInt();
            } 
           seprateZeros(arr);
    	}
    	catch(NegativeArraySizeException e)
    	{
    		System.err.println("Dont put negative Size of array.....");
        }
    	catch(InputMismatchException e)
    	{
    		System.err.println("Please enter only Integer values....");
    	}
	}
}
