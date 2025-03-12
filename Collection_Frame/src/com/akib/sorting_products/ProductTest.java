package com.akib.sorting_products;

import java.util.ArrayList;
import java.util.Collections;

public class ProductTest 
{
     public static void main(String[] args)
     {  
		Product p1 = new Product(102, "Mobile", 75000.0);
		Product p2 = new Product(103, "Laptop", 95000.0);
		Product p3 = new Product(104, "Plastation-5", 65000.0);
		Product p4 = new Product(105, "Camera", 245000.0);
		
		ArrayList<Product>  arl = new ArrayList<>();
		arl.add(p1);
		arl.add(p2);
		arl.add(p3);
		arl.add(p4);
		
		Collections.sort(arl);
		for(Product product: arl)
		{
			System.out.println(product);
		}
	 }
}
