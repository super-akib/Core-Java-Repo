package com.oops.override_method;

public class Circle extends Shape
{
	@Override
	public void draw()
	{
		System.out.println("Circle Draw.");
	}
	
	@Override
	public void erase()
	{
		System.out.println("Circle erase.");
	} 
}
