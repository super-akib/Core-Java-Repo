package com.akib.treeset;

public record Product(Integer productId,String productName)
{
     public Product
     {
       if(productId <=0)
       {
    	 throw new IllegalArgumentException();
       }
     }
}
