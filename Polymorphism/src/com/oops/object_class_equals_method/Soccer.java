package com.oops.object_class_equals_method;

public class Soccer extends Sports
{
  
	@Override
	public String getName(String name)
	{
		return name;
	}
	
	@Override 
	public String getNumberOfTeamMembers()
	{
		return "In "+this.getName(getClass().getSimpleName())+",\neach team has 11 plyares.";
	}
}
