package com.akib.exam06_mar_24;

public class FoodTester {
	public static void main(String[] args) {
      
		FoodCustomer  f1 = new FoodCustomer(1,"Akib","Ampt","4825252");
		FoodCustomer  f2 = new FoodCustomer(1,"Mohd","SR nager","4825252");
		FoodCustomer  f3 = new FoodCustomer(1,"Navid","Ampt","51585252");
		
		FoodOrderService  fs = new FoodOrderService();
		fs.placeOrder(f1);
		
		fs.placeOrder(f2);
	    fs.placeOrder(f3);
		
	    System.out.println(fs.printBill(f3,100));
	    System.out.println(fs.printBill(f2,100));
	    
	    
    }
}
