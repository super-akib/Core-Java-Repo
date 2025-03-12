package com.oops.lab_3_jun_exam;

public abstract class BankAccount
{
    String accountHolder;
    double balance;
    
   public BankAccount(String accountHolder, double balance) {
		super();
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract String displayAccountInfo();
    public void displayBalance()
    {
    	System.out.println("Balance :"+balance);
    }
}
