package nit.logic.array_programs;

import java.util.Scanner;

/*
 * WAP to  store elements into  array and  generate an array
 * In which each and every  is sto
 * 
 * re in its reverse order 
 * 
 * */
public class GenrateArray
{
     
	public static void displayArray(int arr[])
	{
		int rev[] = new int [arr.length];
		System.out.println("Orignal Array Element:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
			rev[i] =revNumber(arr[i]);
		}
		
		System.out.println("\n\nReverse value of elements array:");
		
		for(int i=0;i<rev.length;i++)
		{
			System.out.print(rev[i]+" ");
		}
	}
	public static int revNumber(int num)
	{
		int rev = 0;
		do
		{
            int rem = num%10;
			rev = (rev*10)+rem;
			num /= 10;
		}
		while(num!=0);
		
		return rev;
	}
	
	public static void main(String[] args)
	{
		  Scanner sc = new Scanner(System.in);
          
		  System.out.print("Enter array size:");
		  int size = sc.nextInt();
		  System.out.println("Enter "+size+" array element:");
		  int arr[] = new int[size];
		  for(int i=0;i<arr.length;i++)
		  {
			  System.out.print("element["+i+"]:");
			  arr[i] = sc.nextInt();
		  }
		  
		  displayArray(arr);
		  sc.close();
	}
	
	
	
	
}
