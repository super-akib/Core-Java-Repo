package com.oop.single_level_inheritance;

public class Circle
{
     double radius;
     public Circle()
     {
    	 radius = 5;
     }
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
     
   public double getArea()
   {
	   if(this.radius>0)
	   {
		   return 3.14*(radius*radius);
	   }
	   else
	   {
		   return -1;
	   }
   }

}
