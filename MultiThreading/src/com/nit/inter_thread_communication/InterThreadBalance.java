package com.nit.inter_thread_communication;

public class InterThreadBalance
{  
public static void main(String args[])
	{  
      Customer c = new Customer();    //lock is created here

		Thread son = new Thread()  //anonymous class concept
		{  
			@Override
			public void run()
			{
				c.withdraw(8500);
			}  
		};
		son.start(); 		

		Thread father = new Thread()
		{  
			public void run()
			{
				c.deposit(9000);
			}  
		};
		
		father.start();  
    }
} 