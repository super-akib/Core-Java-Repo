package com.oops.program_on_interface;

public class Airtel implements SIMCardInterface
{
	protected long number;
	protected String network;
	protected boolean isActivate;
	
	public Airtel(long number,String network)
	{
		super();
		this.number = number;
		this.network = network;
		
	}
	@Override
	public long getPhoneNumber()
	{
		return number;
	}

	@Override
	public String networkProvider() 
	{
		return network;
	}
     
	@Override
    public boolean isActivate()
    {
   	 return isActivate;
    }
	@Override
	public void simActivated(boolean activate)
	{
		
		
	}

	
}
