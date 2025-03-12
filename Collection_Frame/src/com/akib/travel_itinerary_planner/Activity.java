package com.akib.travel_itinerary_planner;

public class Activity
{
   private String activityName;
   private String schedule;
   
   public Activity(String activityName,String schedule)
   {
	   this.activityName = activityName;
	   this.schedule  = schedule; 
   }
    
   public String getActivityName()
   {
	   return this.activityName;
   }
   public String getSchedule()
   {
	   return this.schedule;
   }
@Override
public String toString() 
{
	return " -"+ activityName + "(" + schedule + ")";
}
   
   
   
}
