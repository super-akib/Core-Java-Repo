package com.nit.logic13_02_2024;

/*	    for(int i=key; i<arr.length;i++)
  {
    	System.out.print(arr[i]+" ");
   }
   for(int i=0;i<key;i++)
   {
    	System.out.print(arr[i]+" ");
  }
  */

public class ShiftElementsToLeftsideThrowIndex 
{
    public static void shifting(int a[],int key)
    {   
    	for(int j=0; j <key; j++)
    	{
    		int temp =a[0];
    		for(int i=1;i<a.length;i++)
    		{
    			a[i-1] = a[i];
    		}
    		a[a.length-1] = temp;
    	}
    	for(int i=0;i<a.length;i++)
    	{
    		System.out.print(a[i]+" ");
    	}
    }
	public static void main(String[] args) 
	{
		int arr[] = {11,22,33,44,55};
	    int key =3;
     	shifting(arr,key);		
	}
}
