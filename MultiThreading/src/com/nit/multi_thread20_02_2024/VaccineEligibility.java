package com.nit.multi_thread20_02_2024;

public class VaccineEligibility {
	private int age;
	private boolean hasHealthCondition;
	
	public VaccineEligibility(int age,boolean hasHealthCondition)
	{
		super();
		this.age=age;
		this.hasHealthCondition=hasHealthCondition;
	}
	
	public boolean isEligible()
	{
		if((age>=18 && age<60) &&(hasHealthCondition==true))
		{
			return true;
		}
		else
		return false;
	}
	//getter
	public int getAge()
	{
		return this.age;
	}
	
	public boolean getHasHealthCondition()
	{
		return this.hasHealthCondition;
	}

}