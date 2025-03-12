package com.oop.dec7_2023;
import java.util.Scanner;
//ELC
public class Zomato {

	public static void main(String[] args) {
	 
		 Scanner scan = new Scanner(System.in);
		 // input for Customer class
		 System.out.print("Enter Customer Id:");
		 int customerId = scan.nextInt();
		 System.out.print("Enter Customer Name:");
		 String customerName = scan.next();
		 System.out.print("Enter Address :");
		 String address = scan.nextLine();
		        address = scan.nextLine();
		 
		 //input for Order class
		 System.out.print("Order Id:");
		 int orderId = scan.nextInt();
		 System.out.print("Order Name:");
		 String orderName = scan.next();
		 orderName = scan.next();
		 System.out.print("Order Price:");
		 double orderPrice = scan.nextDouble();
		 
		 Order order1 = new Order(orderId,orderName,orderPrice);
		 Customer c1 = new Customer(customerId,customerName,address,order1);
		 
		 System.out.print(c1);
		 
		 scan.close();

	}

}
