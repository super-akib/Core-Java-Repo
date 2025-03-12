package com.akib.sorting_products;

public class Product  implements Comparable<Product> 
{
   private Integer productNumber;
   private String productName;
   private Double productPrice;
   
   public Product(Integer productNumber,String productName, Double productPrice)
   {
	   this.productNumber = productNumber;
	   this.productName = productName;
	   this.productPrice = productPrice;
   }
	
   
	
	@Override
	public int compareTo(Product product)
	{
		return this.productName.compareTo(product.productName);
	}



	@Override
	public String toString() {
		return "Product [productNumber=" + productNumber + ", productName=" + productName + ", productPrice="
				+ productPrice + "]";
	}
    
}
