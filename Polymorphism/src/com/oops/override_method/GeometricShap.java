package com.oops.override_method;

public class GeometricShap 
{
     String shapType;
     double area;
    
    public GeometricShap()
    {
    	this.shapType = "GeometricShape";
    	this.area = 0;
    }
    
    public double computeArea(double value1,double value2)
    {   
    	this.area = value1*value2;
    	return this.area;
    }
    
    public void show()
    {
    	System.out.println("Shape Type:"+shapType);
    	System.out.println("Area is:"+area);
    }
}
