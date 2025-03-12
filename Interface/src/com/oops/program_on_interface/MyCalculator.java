package com.oops.program_on_interface;

public class MyCalculator implements AdvanceArithmetic
{
	@Override 
	public int divisorSum(int number)
	{   
		int sum = 0;
		for(int i=1;i<=number;i++)
		{
			if( i % number == 0)
			{
				sum+= i;
			}
		}
		return sum+number;
	}

}
