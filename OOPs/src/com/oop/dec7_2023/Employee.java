package com.oop.dec7_2023;

//BLC
public class Employee {

	private int empId;
    private String empName;
    private Address address; //HAS-A relation
	public Employee(int empId, String empName, Address address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", address=" + address + "]";
	}

    
}
