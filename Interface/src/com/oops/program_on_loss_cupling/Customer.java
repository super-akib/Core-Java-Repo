package com.oops.program_on_loss_cupling;

public class Customer {
	String name;
	double accountBalance;

	public Customer(String name) {          
		super();
		this.name = name;
	}

	public void deposit(Bank bank, double amount)
	{
		if(amount>0) 
		{	 
		  bank.depositeMoney(amount);
		  accountBalance = bank.checkBalance();
		}
		else
		{
			System.out.println("Invalid amount...");
		}
	}

	public void withdraw(Bank bank, double amount) {
		if(amount>this.accountBalance) { 
			System.out.println("Insufficient funds...");
		}
		else if(amount>0)
		{
		  bank.withdrawMoney(amount);
		  this.accountBalance = bank.checkBalance();
		}
		else
		{
			System.out.println("Invalid amount.....");
		}
	}

	public void checkBalance(Bank bank) 
	{    
		System.out.println("Bank Name:" + bank.getClass().getSimpleName());
		System.out.println("Account Holder Name:" + name);
		System.out.println("Account Balance:" + bank.checkBalance());
	}
}
