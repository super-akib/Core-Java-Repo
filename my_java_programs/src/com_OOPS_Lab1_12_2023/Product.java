package com_OOPS_Lab1_12_2023;

public class Product {
   
	private int productId;
	private String productName;
	private double productPrice;
	public void intializeProduct(int productId,String productName, double productPrice)
	{
		//initialize the product details
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	public void getProductInfo()
	{   
		System.out.println("++++------------++++-----------++++");
		System.out.println("Product ID:"+productId);
		System.out.println("Product Name:"+productName);
		System.out.println("Product Price :Rs."+productPrice);
	}
}
