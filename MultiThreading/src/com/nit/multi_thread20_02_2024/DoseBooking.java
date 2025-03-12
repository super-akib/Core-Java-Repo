package com.nit.multi_thread20_02_2024;

public class DoseBooking {

	private boolean booked;
	

	public boolean bookDose()
	{
		if(booked)
		{
			throw new RuntimeException("Dose already booked.");
		}
		
			booked=true;
		return booked;
		
	}
	
	public boolean isDoseBooked()
	{
		return booked;
	}
	
	//getter
	public boolean getBooked()
	{
		return this.booked;
	}

}