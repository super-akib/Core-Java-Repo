package com.oops.lab09_01_24;
import java.util.Scanner;
import java.util.function.Consumer;
public class Tester 
{

	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Item name:");
		String itemName = scan.nextLine();
		
		System.out.print("Enter price:");
		double price = scan.nextDouble();
		
		System.out.print("Enter quantity:");
		int quantity = scan.nextInt();
				
		CarItem  carItem = new CarItem(itemName,price,quantity);
		
		ShoppingCart  shopCart = new ShoppingCart(carItem);
		
		
		// Lambda expression 
		Consumer<ShoppingCart> shop = (cart)->
		{
		     if(cart.getItems().getTotalPrice()>1000000)
		     {
		    	 double discountPrice = cart.getItems().getTotalPrice()*0.1f;
		    	 System.out.println(cart.getItems());
		    	 System.out.println("Total Price:"+cart.getItems().getTotalPrice());
		    	 System.out.println("Dissount amount:"+discountPrice);
		    	 System.out.println("Nett amount:"+(cart.getItems().getTotalPrice()-discountPrice));
		    	 
		     }
		     else
		     {
		    	 System.out.println(cart.getItems());
		    	 System.out.println("Total Price:"+cart.getItems().getTotalPrice());
		     }
		};
		     
		shop.accept(shopCart);
		scan.close();
	}

}
