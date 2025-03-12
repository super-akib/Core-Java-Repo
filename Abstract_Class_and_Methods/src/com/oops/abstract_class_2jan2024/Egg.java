package com.oops.abstract_class_2jan2024;

public abstract class  Egg extends Food
{
	protected String  type ; 
		
	public Egg(double proteins, double fats, double carbs,double tastyScore)
	{
		super(proteins, fats, carbs,tastyScore);
		
 	}

    @Override
    public   void  getMacros()
    {
    	
    }
	
    @Override
    public String getType()
    {   
    	this.type = "Non-Vagetarian";
    	return this.type; 
    }

	@Override
	public void getMacroNutrients()
	{
       System.out.println("An egg has "+this.proteins+" gms of protein, "+this.fats+" gms of fats and "+this.carbs+" gms of carbohydrates.");
	   System.out.print("Test Score :"+this.tastyScore+" ,Type:"+this.type);	
	}

}
