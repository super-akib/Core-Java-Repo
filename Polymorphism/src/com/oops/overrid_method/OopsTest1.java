package com.oops.overrid_method;

class NIT1
{
	int name;
	 NIT1(int name)
	{
		this.name = name;
	}
}
public class OopsTest1 
{
	public static void main(String[] args) 
	{	
		
		NIT1 f1 = new NIT1(10);
		NIT1 f2 = new NIT1(10);
		NIT1 f3 = f2;
		System.out.println(f1==f2); // False because memory address are different
		System.out.println(f2==f3); // Same memory address(true)
		System.out.println(f1.name==f2.name);//same value that is (true)
		System.out.println(f2.name==f3.name);//same value that is (true)
		System.out.println(f1!=f3);// different memory location (true)
			
	}
}
