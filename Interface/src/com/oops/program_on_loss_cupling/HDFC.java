package com.oops.program_on_loss_cupling;

public class HDFC implements Bank {
	protected double balance;

	@Override
	public void depositeMoney(double amount) {
		this.balance = balance + amount;
	}

	@Override
	public void withdrawMoney(double amount) {

		this.balance = balance - amount;

	}

	@Override
	public double checkBalance() {
		return balance;
	}

}
