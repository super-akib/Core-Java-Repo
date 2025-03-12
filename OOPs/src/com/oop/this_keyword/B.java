package com.oop.this_keyword;

public class B
{
     private A obj;
	 public B(A obj )
	 {   
		 super();
		 this.obj = obj;
		 display();
		 
	 }
	 
	 public void display()
	 {
		 obj.show();
	 }
}
