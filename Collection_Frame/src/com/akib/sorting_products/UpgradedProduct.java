package com.akib.sorting_products;

import java.util.Scanner;

public record UpgradedProduct(Integer productId,String productName,Double productPrice) 
{
	 public static UpgradedProduct StoreProducts()
     {
   	    Scanner sc = new Scanner(System.in);
   	     System.out.print("Enter product Id:");
    	   int productId = sc.nextInt();
    	   System.out.print("Enter product name:");
    	   String name = sc.next();
    	   System.out.print("Enter price:");
    	   double price = sc.nextDouble();
    	 
    	 return new UpgradedProduct(productId, name, price);
     }
}
