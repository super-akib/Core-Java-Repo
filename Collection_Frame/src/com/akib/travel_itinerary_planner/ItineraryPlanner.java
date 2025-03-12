package com.akib.travel_itinerary_planner;

import java.util.ArrayList;

public class ItineraryPlanner
{
    ArrayList<Destination>  destinations = new ArrayList<>();
    
    public void addDestinations(Destination destination)
    {
    	destinations.add(destination);
    }
    
    public String retriveDestinations()
    {
    	String d ="";
    	for(Destination dest: destinations)
    	{
    		d += dest+"\n";
    	}
    	return d;
    }

	@Override
	public String toString() {
		return retriveDestinations();
	}
    
}
