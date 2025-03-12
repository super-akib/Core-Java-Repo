package com.oop.single_level_inheritance;

public class Ticket
{

	protected String eventName;
	private int seatNumber;
	private double price;
	
	public Ticket(String eventName,int seatNumber,double price)
	{
		super();
		this.eventName = eventName;
		this.seatNumber = seatNumber;
		this.price = price;
	}
	//Getter and Setter for Event name
	public String getEventName()
	{
		return this.eventName;
	}
    public void setEventName(String eventName)
    {
    	this.eventName = eventName;
    }
    //Getter and Setter for seat number
    public int getSeatNumber()
    {
    	return this.seatNumber;
    }
    public void setSeatNumber(int seatNumber)
    {
    	this.seatNumber = seatNumber;
    }
	//Getter and Setter for price
    public double getPrice()
    {
    	return this.price;
    }
	public void setPrice(double price) {
		this.price = price;
	}
     
	public String toString()
	{
		return "Regular :"+"\n Event:"+eventName+"\n Seat Number:"+seatNumber+"\n Price :$"+price;
	}
}
