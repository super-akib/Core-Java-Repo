package com_OOPS_Lab1_12_2023;

import java.util.Scanner;

public class Main {//ELC
  
	public static void main(String []args)
	{   
		Product item=new Product();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter product Id:");
		int productId = scan.nextInt();
		System.out.print("Enter product Name:");
		 String productName = scan.next();
		System.out.print("Enter product price:");
		double productPrice = scan.nextDouble();
		scan.close();

		item.intializeProduct(productId,productName,productPrice);
		item.getProductInfo();
		
	}
  
}
