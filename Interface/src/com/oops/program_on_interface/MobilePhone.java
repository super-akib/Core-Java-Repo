package com.oops.program_on_interface;

public class MobilePhone implements MobilePhoneInterface
{

	@Override
	public void insertSimCard(SIMCardInterface sim) 
	{
		if(sim.isActivate() == false)
		{
			sim.simActivated(true);
			System.out.println("Sim inserted...");
			System.out.println("Sim Card:"+sim.getClass().getSimpleName());
			System.out.println("Phone number:"+sim.getPhoneNumber());
			System.out.println("Network Type:"+sim.networkProvider());
		}
		else
		{
			System.out.println("Sim already inserted in device....");
		}
		
	}

	@Override
	public void removingSimCard(SIMCardInterface sim)
	{
		if(sim.isActivate() == false)
		{
			sim.simActivated(false);
			System.out.println(sim.getClass().getSimpleName()+" is removed..");
		}
		else
		{
			System.out.println("Sim is never inserted....");
		}
	}

	@Override
	public void makingCalls(SIMCardInterface sim) 
	{
		if(sim.isActivate())
		{
			System.out.println("Calling from "+sim.getClass().getSimpleName());
		}
		else
		{
			System.out.println("Sim is not activated ...");
		}
	}

	@Override
	public void sendingMessage(SIMCardInterface sim)
	{
		if(sim.isActivate())
		{
			System.out.println("Message from "+sim.getClass().getSimpleName());
		}
		else
		{
			System.out.println("Sim is not activated ...");
		}
	}
     
}
