package exam.Dec6_2023;

public class FitnessTracker {
   private String Date ;
   private int steps ;
   private  double calories;

   public FitnessTracker(String date, int steps, double calories)
   {
	super();
	Date = date;
	this.steps = steps;
	this.calories = calories;
   }
   public void upDateSteps(int steps)
   {
	   this.steps = steps;
	   
   }
   
}
