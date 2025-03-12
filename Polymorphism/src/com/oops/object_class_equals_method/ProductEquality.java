package com.oops.object_class_equals_method;

public class ProductEquality 
{

	public static void main(String[] args)
	{
		Product p1 = new Product(1241,"Iphone 15 pro");
		Product p2 = new Product(1241,"Iphone 15 pro");	
		Product p3 = new Product(1241,"Samsung S24 ultra");
		
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
	}

}
