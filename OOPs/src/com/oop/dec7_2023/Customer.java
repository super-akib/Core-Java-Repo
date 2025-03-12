package com.oop.dec7_2023;
//BLC
public class Customer 
{
	  private int customerId;
	  private String customerName;
	  private String customerAddress;
	  private Order order; //HAS-A relation
	
	  public Customer(int customerId, String customerName, String customerAddress, Order order) 
	  {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.order = order;
	  }

	@Override
	public String toString()
	{
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + ", order=" + order + "]";
	}

     
      

}
