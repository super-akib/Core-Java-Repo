
/*WAP to store 10 no.s  into array and perform following  tasks
 i.display all the elements store in array.
 ii. display all the values which are even.
 iii.display all the values which are odd.
 iv.display all the values which are divisible by both 2 and 3.
 v.display all the values which are divisible by 5.
  */
package com.nit.array_example;
public class PerformOperationOnArrayElement 
{ 
	public static void displayElements(int num1[])
	{   
		System.out.println("Array Elements:");
		for(int index = 0 ;index<num1.length; index++)
		{
			System.out.print(num1[index]+" ");
		}
		System.out.println("\n");
	}
	
	public static void displayEvenElements(int num2[])
	{   
		
		for(int index = 0 ; index<num2.length; index++ )
		{
			if(num2[index]%2 == 0)
			{
				System.out.print(num2[index]+" ");
			}
		}
	}
	
	public static void displayOddElements(int num2[])
	{
		for(int index = 0 ; index<num2.length; index++ )
		{
			if(num2[index]%2 != 0)// num2[index]%2==1
			{
				System.out.print(num2[index]+" ");
			}
		}
		System.out.println("\n");
	}
	public static void displayDivisibleByTwoThree(int num2[])
	{
		for(int index = 0 ; index<num2.length; index++ )
		{
			if(num2[index]%2 == 0 && num2[index]%3 == 0)
			{
				System.out.print(num2[index]+" ");
			}
		}
		System.out.println("\n");
	}
	
	public static void displayDivisibleByFive(int num2[])
	{
		for(int index = 0 ; index<num2.length; index++ )
		{
			if(num2[index]%5 == 0)
			{
				System.out.print(num2[index]+" ");
			}
		}
		System.out.println("\n");
	}
    public static void main(String[] args) {
		
    	int num[] = { 10,11,12,15,75,84,60,35,55,40};
    	
    	displayElements(num);
    	displayEvenElements(num);
    	displayOddElements(num);
    	displayDivisibleByTwoThree(num);
    	displayDivisibleByFive(num);
	}
	
}
