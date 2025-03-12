package nit.logic.two_d_array;

import java.util.Scanner;
class Elements
{ 
	public static void findOccurrence(int arr[])
	{      
		for(int i=0;i<arr.length;i++)
		{   
		    int count = 0;
			for(int j=0;j<arr.length;j++)
			{    
				if(arr[i]== arr[j] && i>j)
				{
					break;
				}
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			if(count>0)
			{
				System.out.println(arr[i]+" present "+count+" times");
			}	
			
		}
	}
}
public class Occurrence
{
     public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter array elements:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("element["+i+"]:");
			arr[i]= sc.nextInt();
		}
		System.out.println("---------------------------------------");
		Elements.findOccurrence(arr);
		sc.close();
	}
}
