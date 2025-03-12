package com.oops.override_method;

public class ShapeDemo
{

	public static void main(String[] args) 
	{
		
		Shape sh = Shape.randshape();
		// call draw and erase methods
	     sh.draw();
	     sh.erase();
	 System.out.println("---------------------------");
		
	     Shape sh1 = Shape.randshape();
		// call draw and erase methods
	     sh1.draw();
	     sh1.erase();
		
	 System.out.println("---------------------------");
	  
	    Shape sh2 = Shape.randshape();
		// call draw and erase methods
	     sh2.draw();
	     sh2.erase();
		
	 System.out.println("---------------------------");	
		
	    Shape sh3 = Shape.randshape();
		// call draw and erase methods 
	     sh3.draw();
	     sh3.erase();
	}

}
