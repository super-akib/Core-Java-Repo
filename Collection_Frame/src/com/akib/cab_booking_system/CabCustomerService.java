package com.akib.cab_booking_system;

import java.util.ArrayList;

public class CabCustomerService 
{
    private ArrayList<CabCustomer> cabCustomers = new ArrayList<>();
    
    public void addCabCustomer(CabCustomer customer)
    {
    	cabCustomers.add(customer);
    }
    
    public boolean isFirstCustomer(CabCustomer customer)
    {
    	boolean flag = true;
    	for(int i=0;i<cabCustomers.size();i++)
    	{
    		if(customer.getPhoneNumber() == cabCustomers.get(i).getPhoneNumber())
    		{
    		    flag = false;
    			break;
    		}
    	}
    	
    	return flag;
    }
    
    public double calculateBill(CabCustomer customer)
    {   
    	double bill=0 ;
    	if(isFirstCustomer(customer))
    	{
    		bill=0;
    	}
    	else if(customer.getDistance()<= 4)
    	{
    		bill=80;
    	}else
    	{
    		bill = 80 + (customer.getDistance()*6);
    	}
    	
    	return bill;
    }
    
    public String printBill(CabCustomer customer ,double bill)
    {   
    	return customer.getCustomerName()+" Please pay your bill of Rs."+bill;
    }
}
