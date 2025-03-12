package com.oops.lab18_dec_2023;

public class LightDevice  extends SmartHomeDevice
{   
	//Parameterized constructor
    public LightDevice(String type )
    {
    	super(type);
    }
    
    // Instance method with parameter
    public void dim(int brightness)
    {
    	System.out.println("Light brightness is set to :"+brightness+"%");
    }
    
}
