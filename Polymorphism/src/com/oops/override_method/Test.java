package com.oops.override_method;

public class Test
 {

	public static void main(String[] args)
	{
	  
		GeometricShap  gs = new Rectangle();
		gs.computeArea(5,15);
		gs.show();
		
		System.out.println("------------------------------");
		
		Cuboid co = new Cuboid();
		
		co.computeArea(5,5);
		co.show();
	}

}
