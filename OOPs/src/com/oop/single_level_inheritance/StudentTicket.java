package com.oop.single_level_inheritance;

public class StudentTicket extends Ticket
{
    private boolean studentDiscount;

	public StudentTicket(String eventName, int seatNumber, double price, boolean studentDiscount) {
		super(eventName, seatNumber, price);
		this.studentDiscount = studentDiscount;
	}

	public boolean getStudentDiscount() {
		return studentDiscount;
	}

	public void setStudentDiscount(boolean studentDiscount)
	{
		this.studentDiscount = studentDiscount;
	}

	public String toString()
	{
		return "Student Ticket :"+"\n Event:"+getEventName()+"\n Seat Number:"+getSeatNumber()+"\n Price :$"+getPrice()+"\n Student Descount:"+studentDiscount;
	}
     
	
}
