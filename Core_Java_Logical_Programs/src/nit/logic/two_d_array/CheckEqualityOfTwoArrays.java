package nit.logic.two_d_array;

import java.util.Arrays;
import java.util.Scanner;
class EqualityCheck
{
    public static void checkEquality(int num1[],int num2[])
    {   
    	int count=0;
    	if(num1.length==num2.length)
    	{	
    	  for(int i=0;i<num1.length;i++)
    	  {
    		  if(num1[i]==num2[i])
    		  {
    			  count++;
    		  }
    	  }	  
    	}
    } 
}
public class CheckEqualityOfTwoArrays 
{  
   	
   public static void main(String[] args) 
   {
	   Scanner scan = new Scanner(System.in);
	   System.out.print("Enter array-1 Size:");
	   int num1 =scan.nextInt();
	   System.out.print("Enter array-2 Size:");
	   int num2 =scan.nextInt();	   
	   int arr1[] = new int [num1];
	   int arr2[] = new int [num2];
	   
	   System.out.println("Enter elements for Array-One:");
	   for(int i=0;i<arr1.length;i++)
	   {
		   System.out.print("element["+i+"]:");
		   arr1[i] = scan.nextInt();
	   }
	   System.out.println("Enter elements for Array-Two:");
	   for(int i=0;i<arr2.length;i++)
	   {
		   System.out.print("element["+i+"]:");
		   arr1[i] = scan.nextInt();
	   }
	   Arrays.equals(arr1,arr2);
	   EqualityCheck.checkEquality(arr1, arr2);
	   scan.close();
   }
   
}
