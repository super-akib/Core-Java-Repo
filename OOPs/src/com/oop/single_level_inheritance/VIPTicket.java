package com.oop.single_level_inheritance;

public class VIPTicket extends Ticket 
{
     private String specialAccess;
     
     public VIPTicket(String eventName ,int seatNumber,double price,String specialAccess)
     {
    	 super(eventName,seatNumber,price);
    	 this.specialAccess = specialAccess;
     }
    
      //getter and setter for Special Access
	public String getSpecialAccess() {
		return specialAccess;
	}

	public void setSpecialAccess(String specialAccess) {
		this.specialAccess = specialAccess;
	}
	public String toString()
	{
		return "VIP Ticket :"+"\n Event:"+getEventName()+"\n Seat Number:"+getSeatNumber()+"\n Price :$"+getPrice()+"\n Special Access:"+specialAccess;
	}
     
}
