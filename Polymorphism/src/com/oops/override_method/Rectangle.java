package com.oops.override_method;

public class Rectangle extends GeometricShap
{
   
	private double width;
	private double length;
	
	public Rectangle()
	{   
		super();
		this.width = 10;
		this.length = 10;
	}
	
	public double getWidth()
	{
		return width;
	}
	public void setWidth(double width)
	{
		this.width = width;
	}
	public double getLength()
	{
		return length;
	}
	public void setLength(double length)
	{
		this.length = length;
	}

	@Override
	public double computeArea(double width , double length )
	{   
		this.width  = width;
		this.length  = length;
		
		super.area = this.width*this.length;
		
		return super.area;
	}
	
	@Override
	public void show()
	{
		System.out.println("Width of rectangle:"+width);
		System.out.println("Length of rectangle:"+length);
		System.out.println("Area of rectangle:"+super.area);
	}
	
	
}
