package com.oops.lab_3_jun_exam;

public class SavingsAccount extends BankAccount
{
    double intrestRat;
    
	
	public SavingsAccount(String accountHolder, double balance, double intrestRat) {
		super(accountHolder, balance);
		this.intrestRat = intrestRat;
	}

	@Override
	public void deposit(double amount)
	{
		this.balance += amount;
	}

	@Override
	public void withdraw(double amount) 
	{
		this.balance -= amount;
		
	}

	@Override
	public String displayAccountInfo() {
		
		return null;
	}
     
}
