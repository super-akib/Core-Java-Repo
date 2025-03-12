package com.akib.car_engine_specification;

public class Car
{ 
    private Engine engine;
    
    public Car(Engine engine)
    {
    	this.engine = engine;
    }
    
    public void drive(int model)
    {
    	switch(model)
    	{
    	 case  0:
    		     System.out.println("Engine Started.");
    	    	 break; 
    	 case 1:	
    		    System.out.println("Engine fail kindly try once!");
    	        break;  
    	 case 2:
    		    System.out.println("Need Servicing !!.");
    	        break;
    	 default :   
    	          System.err.println("Invalid input.");	
    	           
         }
    }
        
}
