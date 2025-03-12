package com.nit.lab_10_02_24_multithreading;

public class RailwayReservationSystem implements Runnable
{   
	private int seatAvailable=1;
	private int wantedSeat;
	
	public RailwayReservationSystem(int wantedSeat)
	{
		this.wantedSeat = wantedSeat;
	}
	
	public void setSeatAvailable(int seat)
	{
		this.seatAvailable = seat;
	}
	public int getSeatAvailable()
	{
		return seatAvailable;
	}
	@Override
	public void run()
	{
		if(seatAvailable>= wantedSeat)
		{
			System.out.println("Seat Reserved Sucessfully..");
			seatAvailable -= wantedSeat; 
		}
	}

	

}
