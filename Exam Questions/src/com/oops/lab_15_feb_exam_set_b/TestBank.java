package com.oops.lab_15_feb_exam_set_b;

public class TestBank 
{
     public static void main(String[] args)
     {
		Bank  bank = new Bank();
		Thread withdraw = new Thread()
		{
		    public void run()
		    {
		    	bank.withdraw(100);
		    } 		
		};
		withdraw.start();
		
		Thread deposit = new Thread()
		{
		    public void run()
		    {
		    	bank.deposit(12000);
		    } 		
		};
		deposit.start();
		
	 }
}
