package com.oop.this_keyword;

public class A 
{
   private int data = 15;
   
   public A()
   {   
	   B b1 = new B(this);
   }
   public void show()
	 {
		 System.out.println("Data:"+data);
	 }
}
