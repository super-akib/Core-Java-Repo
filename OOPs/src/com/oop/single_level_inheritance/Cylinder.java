package com.oop.single_level_inheritance;

public class Cylinder extends Circle
{
     double height;
     public Cylinder()
     {
    	 super();
    	 this.height = 5;
     }
	public Cylinder(double radius,double height) {
		super(radius);
		this.height = height;
	}
     
	public double getVolume()
	{
		if(this.height>0)
		{
			return 3.14*((radius*radius)*height);
		}
		else
		{
			return -1;
		}
	}
     
}
