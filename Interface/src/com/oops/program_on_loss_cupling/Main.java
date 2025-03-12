package com.oops.program_on_loss_cupling;

public class Main 
{

	public static void main(String[] args)
	{
	     Bank sbi = new SBI();
	     Bank hdfc = new HDFC();
	     Bank icici = new ICICI();
	     
	     Customer customer = new Customer("Akib");
	     
	    customer.deposit(icici, 0);
	     customer.withdraw(sbi, 20000);
	     customer.checkBalance(icici);
	     
	}

}
