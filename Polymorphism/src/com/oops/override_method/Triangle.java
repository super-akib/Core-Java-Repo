package com.oops.override_method;

public class Triangle  extends Shape
{
	@Override
	public void draw()
	{
		System.out.println("Triangle Draw.");
	}
	@Override
	public void erase()
	{
		System.out.println("Triangle erase.");
	} 
}
