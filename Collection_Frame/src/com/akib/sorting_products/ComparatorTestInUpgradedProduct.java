package com.akib.sorting_products;

import java.util.ArrayList;
import java.util.Comparator;

public class ComparatorTestInUpgradedProduct
{   
	
      public static void main(String args[])
      {  
    	  ArrayList<UpgradedProduct> arl = new ArrayList<>();
         
         for(int i=1;i<=4;i++)
         {   
        	 UpgradedProduct p = UpgradedProduct.StoreProducts();
        	 arl.add(p);
         }
         
        
      }
      
     
}
