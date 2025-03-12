package com.nit.inter_thread_communication;

class Customer
{  
     int balance = 10000;    

	public synchronized void withdraw(int amount) //amount = 15000   
	{  
		System.out.println("going to withdraw...");    
		if(balance < amount)
			{  
				System.out.println("Less balance; waiting for deposit...");  
					try
					{
						wait();  //waiting and releasing the lock
					}
					catch(Exception e){}  
			}  
		balance  = balance - amount;
		System.out.println("withdraw completed..."+balance+" is remaining balance"); 
	}    

	public synchronized void deposit(int amount)   //amount = 9000
		{  
			System.out.println("going to deposit...");  
			balance = balance + amount;  
			System.out.println("Balance after deposit is :"+balance);
			System.out.println("deposit completed... ");  
			notify();  
		}  
}   