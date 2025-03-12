package com.oops.lab09_01_24;

public class ShoppingCart 
{
   private CarItem items ;
   
   public ShoppingCart(CarItem items)
   {
	   super();
	   this.items = items;
   }

   public CarItem getItems() 
   {
	 return items;
   }

   public void setItems(CarItem items)
   {
	this.items = items;
   }

   @Override
   public String toString() 
   {
	return "ShoppingCart [items=" + items + "]";
   }
   
   
}
