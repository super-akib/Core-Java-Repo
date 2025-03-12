package com.oops.lab_3_jun_exam;

public class CurrentAccount extends BankAccount 
{
   
	 double intrestRate;

	public CurrentAccount(String accountHolder, double balance, double intrestRate) {
		super(accountHolder, balance);
		this.intrestRate = intrestRate;
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String displayAccountInfo() {
		// TODO Auto-generated method stub
		return null;
	}
	 
}
