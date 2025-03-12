package com.akib.treeset;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetForProduct {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		try(sc) 
		{   
			System.out.println("Enter how many Products we want to:");
			int num = sc.nextInt();
			
			//Product data in Asending Order
			Set<Product>  ts = new TreeSet<>((pro1,pro2)->pro1.productId()-pro2.productId()); 
			//Product data in Desending Order
			Set<Product> ts1 = new TreeSet<>((product1, product2) -> product2.productId() - product1.productId());
			//Product data in Alphabatical Order
			Set<Product> ts2 = new TreeSet<>((product1, product2) -> product1.productName().compareTo(product2.productName()) );
			//Product data in Reverse Order
			Set<Product> ts3 = new TreeSet<>((product1, product2) -> -(product1.productName().compareTo(product2.productName())) );
			
			for(int i=1;i<=num;i++)
			{
				System.out.print("Enter product Id:");
				int productId =sc.nextInt();
				System.out.print("Enter product Name:");
				String productName = sc.next();
				
				Product product = new Product(productId,productName);
				ts.add(product);
				
				ts1.add(product);
				
				ts2.add(product);
				
				ts3.add(product);
			}
			
			
			
			System.out.println("================================================");
			System.out.println("Ascending Order:\n...................");
			
			ts.forEach(System.out::println);

			System.out.println("================================================");
			System.out.println("Descending Order:\n................");
			
			ts1.forEach(System.out::println);

			System.out.println("================================================");
			System.out.println("Alphabatical Order:\n................");
			

			ts2.forEach(System.out::println);

			System.out.println("================================================");
			System.out.println("Reverse Order:\n................");
			
			
			ts3.forEach(System.out::println);
		  }
		   catch(IllegalArgumentException e)
		   {
			   System.err.println("Please enter only positive and non-zero value...");
		   }

		}

	}
