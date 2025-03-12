package com.oops.object_class_equals_method;

public class Product 
{   
	//instance variables 
   private int productId;
   private String productName;
   
   //Parameterize constructor
   public Product(int productId, String productName)
   {
	   super();
	   this.productId = productId;
	   this.productName = productName;
   }
   
   @Override
   public boolean equals(Object obj)
   {
	   if(obj instanceof Product)
	   {
		   Product  p1 = (Product) obj;
		   if(this.productId == p1.productId && this.productName.equals(p1.productName))
		   {
			   return true;
		   }
		   else
		   {
			   return false;
		   }
	   }
	   else
	   {   
		   System.err.println("Compareson not possible due to Object is not Product class.");
		   return false;
	   }
   }
}
