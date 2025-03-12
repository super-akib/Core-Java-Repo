package com.oops.abstract_class_2jan2024;

public abstract class Food 
{  
	// instance variables
   protected  double  proteins;
   protected  double fats;
   protected double carbs;
   protected double tastyScore;
   
   public Food(double proteins, double fats, double carbs, double tastyScore) {
	super();
	this.proteins = proteins;
	this.fats = fats;
	this.carbs = carbs;
	this.tastyScore = tastyScore;
}

public abstract void getMacroNutrients();
public  abstract String getType();
public  abstract void getMacros();
public  abstract String getTaste();
   
}
