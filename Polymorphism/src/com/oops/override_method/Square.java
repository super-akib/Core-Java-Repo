package com.oops.override_method;

public class Square extends Shape
{
	@Override
	public void draw()
	{
		System.out.println("Square Draw.");
	}
	@Override
	public void erase()
	{
		System.out.println("Square erase.");
	} 

}
