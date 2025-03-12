package com.oops.override_method;

public class Shape
{
	public static Shape randshape()
	{   
		Shape  s1 = null;
		switch((int) (Math.random()*3))
		{
		  case 0 : s1 = new Circle(); break;
		  case 1 : s1 = new Square(); break;
		  case 2 : s1 = new Triangle(); break;
		  default : System.out.println("Invalid Option");
		}
		
		return s1;
	}
	
	public void draw()
	{
		System.out.println("Shape Draw.");
	}
	
	public void erase()
	{
		System.out.println("Shape erase.");
	} 

}
