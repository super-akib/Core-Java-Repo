package com.oops.abstract_class_2jan2024;

public class Bread  extends Food
{
	public Bread(double proteins, double fats, double carbs, double tastyScore) {
		super(proteins, fats, carbs, tastyScore);
		// TODO Auto-generated constructor stub
	}


	protected String type; 
	
	
    @Override
    public void getMacroNutrients()
    {
    	System.out.println(" A slice of bread has "+this.proteins +"gms of protein,"+ this.fats+" gms of fats and "+this.carbs+" gms of carbohydrates.");
    	System.out.print("Testy Score:"+this.tastyScore+"Type:"+this.type);
    }


	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void getMacros() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public String getTaste() {
		// TODO Auto-generated method stub
		return null;
	}
}
