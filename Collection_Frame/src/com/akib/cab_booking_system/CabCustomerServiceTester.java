package com.akib.cab_booking_system;

public class CabCustomerServiceTester 
{
	public static void main(String[] args)
	{
	    CabCustomer  cust1 = new CabCustomer(101,"Akib","Ameerpet","Secundrabad",7,"7385932895");
	    CabCustomer  cust2 = new CabCustomer(101,"Naved","Ameerpet","High-tech city",16,"7219722626");
	    CabCustomerService  ccs = new CabCustomerService();
	    ccs.addCabCustomer(cust2);	    
	    double  bill = ccs.calculateBill(cust1);
	    System.out.println(ccs.printBill(cust1, bill));
	    
	    bill = ccs.calculateBill(cust2);
	    System.out.println(ccs.printBill(cust2, bill));
	    

	}

}
