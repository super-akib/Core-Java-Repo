package com.oops.abstract_class_2jan2024;

public class Test  extends Car
{
    @Override
    public void display()
    {
    	System.out.println("Brand name:"+this.carBrand()+"\nModel name:"+this.carModel()+"\nMileage:"+this.carMileage());
    	System.out.println("Top-Speed:"+this.carTopSpeed()+"\nYear of Manufacture:"+this.carYear());
    }
    // main method
    public static void main(String args[])
    {
    	Test t1 = new Test();
    	
    	t1.display();
    }
}
