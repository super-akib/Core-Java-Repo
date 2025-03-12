package com.oops.program_on_loss_cupling;

public class ICICI implements Bank {
	protected double balance = 10000;

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
