package com.oops.lab09_01_24;

public class CarItem
{
    private String name;
    private double price;
    private int quantity;
    
    public  CarItem(String name,double price,int quantity)
    {
    	super();
    	this.name = name;
    	this.price = price;
    	this.quantity = quantity;
    }
    public double getTotalPrice()
    {
    	return (this.price * this.quantity);
    }
    @Override 
    public String toString()
    {   
    	String str = "CarItem[Name of part:"+name+" ,Price:"+price+" ,Qty:"+quantity+"]";
    	return str;
    }
    
}
