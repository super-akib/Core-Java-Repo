package com.akib.exam06_mar_24;

public class FoodCustomer 
{
	private int customerId ;

    private String customerName ;

	private String address; 

	private String phoneNumber ;
	
	public FoodCustomer()
	{
		
	}

	public FoodCustomer(int customerId, String customerName, String address, String phoneNumber) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "FoodCustomer [customerId=" + customerId + ", customerName=" + customerName + ", address=" + address
				+ ", phoneNumber=" + phoneNumber + "]";
	}
	
}
