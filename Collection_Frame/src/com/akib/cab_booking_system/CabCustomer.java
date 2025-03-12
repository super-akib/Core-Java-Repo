package com.akib.cab_booking_system;

public class CabCustomer 
{
    private Integer customerId;
    private String  customerName;
    private String  pikup_Loacation;
    private String  drop_Location;
    private Integer distance;
    private String phoneNumber;
    //No argument constructor 
    public CabCustomer()
    {
    	
    }
    //Parametrised constructor
    public CabCustomer( Integer customerId,String customerName,
    		String pickup_location,String drop_location,Integer distance,String phoneNumber)
    {
       this.customerId = customerId;
       this.customerName = customerName;
       this.pikup_Loacation = pickup_location;
       this.drop_Location = drop_location;
       this.distance = distance;
       this.phoneNumber = phoneNumber;
    }
    
    //Setters
	public void setCustomerId(Integer customerId)
	{
		this.customerId = customerId;
	}
	
	public void setCustomerName(String customerName) 
	{
		this.customerName = customerName;
	}
	
	public void setPikup_Loacation(String pikup_Loacation) 
	{
		this.pikup_Loacation = pikup_Loacation;
	}
	
	public void setDrop_Location(String drop_Location) {
		this.drop_Location = drop_Location;
	}
	public void setDistance(Integer distance) 
	{
		this.distance = distance;
	}
	
	public void setPhoneNumber(String phoneNumber) 
	{
		this.phoneNumber = phoneNumber;
	}
	//Getters
	public Integer getCustomerId() 
	{
		return customerId;
	}
	
	public String getCustomerName()
	{
		return customerName;
	}
	
	public String getPikup_Loacation()
	{
		return pikup_Loacation;
	}
	
	public String getDrop_Location()
	{
		return drop_Location;
	}
	
	public Integer getDistance()
	{
		return distance;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
    
    
    
    
}
