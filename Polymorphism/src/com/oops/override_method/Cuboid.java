package com.oops.override_method;

public class Cuboid extends Rectangle
{
  
	 private double height;
	 
	 public Cuboid()
	 {
		 super();
		 this.height = 15;
	 }
	 
	 public double getHeight()
	 {
		 return this.height;
	 }
	 
	 public void setHeight(double height)
	 {
		 this.height = height ;
	 }
	 
	 public double computeArea(double width,double lenght,double height)
	 {   
		this.height = height;
		setWidth(width);
		setLength(lenght);
		 super.area = super.computeArea(width, lenght)*this.height;
		 return super.area;
	 }
	 
	 @Override
	 public void show()
	 {
		 System.out.println(" Cuboid :");
		 System.out.println("Width:"+getWidth()+" ,Length:"+getLength()+" ,Height:"+height);
		 System.out.println("Area :"+super.area);
	 }
}

