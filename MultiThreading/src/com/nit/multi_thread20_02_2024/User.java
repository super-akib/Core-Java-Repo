package com.nit.multi_thread20_02_2024;

public class User {
	String userName;
	VaccineEligibility vaccineEligibility;
	DoseBooking doseBooking;
	
	public User(String userName,int age,boolean hasHealthCondition)
	{
		super();
		this.userName= userName;
		this.vaccineEligibility=new VaccineEligibility(age, hasHealthCondition);
		this.doseBooking=new DoseBooking();
	}
	
	public boolean isEligible()
	{
		if(vaccineEligibility.isEligible())
			return true;
		else
		return false;
	}
	
	public void bookDose()
	{
		if(isEligible())
		{
			doseBooking.bookDose();
		}
		else
		{
			throw new RuntimeException("You are not eligible for the vaccine.");
		}
	}
	
	public boolean isDoseBooked()
	{
		if(doseBooking.isDoseBooked())
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}