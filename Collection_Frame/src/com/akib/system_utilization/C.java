package com.akib.system_utilization;

public class C 
{
	public void display(int a1, int b1 ,I1 i1)
	{
		if(i1 instanceof A)
		{
			System.out.println("A class m1():"+new A(a1,b1));
		}
		else if(i1 instanceof B)
		{
			System.out.println("B class m1():"+new B(a1,b1));
		}
		else
		{
			System.err.println("Invalide Object..");
		}
			
	}
}
