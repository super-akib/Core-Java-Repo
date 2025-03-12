package com.akib.travel_itinerary_planner;

public class Test
{
   public static void main(String[] args) 
   {
	   Activity   activity1 = new Activity("Visit Eiffel Tower", "Morning");
	   Activity   activity2 = new Activity("Louvre Museum", "Afternoon");
	   
	   Destination  d1 = new Destination("Pairs");
	   d1.addActivities(activity1);
	   d1.addActivities(activity2);

	   Destination  d2 = new Destination("London");
	   
	   Activity   activity3 = new Activity("British Museum", "Morning");
	   Activity   activity4 = new Activity("London Eye", "Afternoon");
	   
	   d2.addActivities(activity3);
	   d2.addActivities(activity4);
	    
	   ItineraryPlanner   itinerary = new ItineraryPlanner();
	   itinerary.addDestinations(d1);
	   itinerary.addDestinations(d2);
	   
	   System.out.println(itinerary);
	   
	   
	   
	   
   }
	 
}
