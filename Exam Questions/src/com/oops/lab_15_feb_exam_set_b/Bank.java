package com.oops.lab_15_feb_exam_set_b;

public class Bank  extends Thread
{
    double initialBalance;
    public Bank()
    {
    	this.initialBalance = 500;
    }
 
    public void withdraw(double amount)
    {  
    	
    	if(amount > initialBalance)
    	{  
    		System.out.println("Insafficient balance ...");
    		try
    		{
    			Thread.sleep(1000);
    		}
    		catch(InterruptedException e)
    		{
    			System.err.println(e);
    		}
    	}
    	else
    	{
    	   System.out.println("Available Balance:"+(initialBalance-amount));
    	}
    }
    public void deposit(double amount)
    {
    	initialBalance += amount;
    	System.out.println("Total balance after is:"+initialBalance);
    }
    
    
}
