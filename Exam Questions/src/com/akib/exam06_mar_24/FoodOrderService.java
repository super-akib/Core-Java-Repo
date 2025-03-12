package com.akib.exam06_mar_24;

import java.util.ArrayList;

public class FoodOrderService 
{  
	ArrayList<FoodCustomer>  arl = new ArrayList<FoodCustomer>();
	
	public void placeOrder(FoodCustomer fc)
	{
		arl.add(fc);
	}
	
	public boolean isFirstCustomer(FoodCustomer customer)
    {
    	boolean flag = true;
    	for(int i=0;i<arl.size();i++)
    	{
    		if(customer.getPhoneNumber() == arl.get(i).getPhoneNumber())
    		{
    		    flag = false;
    			break;
    		}
    	}
    	
    	return flag;
    }
    
    public double calculateBill(FoodCustomer customer)
    {   
    	double bill=0 ;
    	if(isFirstCustomer(customer))
    	{
    		bill=0;
    	}
    	else 
    	{
    		bill=80;
    	}
    	
    	return bill;
    }
    
    public String printBill(FoodCustomer customer ,double bill)
    {   
    	return customer.getCustomerName()+" Please pay your bill of Rs."+bill;
    }

	

}
