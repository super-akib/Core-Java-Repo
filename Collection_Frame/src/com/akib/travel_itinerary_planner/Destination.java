package com.akib.travel_itinerary_planner;

import java.util.ArrayList;

public class Destination 
{
   private String destinationName;
	ArrayList<Activity>  acList ;
	
	public Destination(String destinationName) {
		super();
		this.destinationName = destinationName;
		this.acList=new ArrayList<Activity>();
		}
	//Store activities in array list
    public void addActivities(Activity  activity)
    {
    	 acList.add(activity);
    }
     public  String retriveActivity()
     {
    	 String activity="";
    	 for(Activity act: acList)
    	 {
    		 activity += act+"\n";
    	 }
    	return activity; 
     }
	@Override
	public String toString() {
		return "Destination:" + destinationName + "\n" + retriveActivity()+ "";
	}
	
	
	
}
