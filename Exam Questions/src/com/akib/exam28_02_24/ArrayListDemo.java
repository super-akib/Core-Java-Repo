package com.akib.exam28_02_24;

import java.util.ArrayList;

public class ArrayListDemo 
{
	
   public static void main(String[] args) {
	   ArrayList<String>  arl = new ArrayList<String>();
			      
			   arl.add("Red");
			   arl.add("Green");
			   arl.add("Orange");
			   arl.add("White");
			   
		arl.remove(2);
		System.out.println(arl);
   }
   
   
   
}
