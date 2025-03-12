package com.oops.has_a_relation_composition;

public class Coil
{
    private String coilType;
    private int wattage;
    
    public Coil(String coilType ,int wattage)
    {
    	this.coilType = coilType;
    	this.wattage = wattage;
    }
    
    public String toString()
    {
    	return "Coil type:"+coilType+",Wattage:"+wattage+"W";
    }
    
}
