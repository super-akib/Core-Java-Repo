package day2_Lab;

public class A1Backery {
  
	public static void main(String args[]) {
		String item;
		float price,total,qty;
		item = args[0];
		qty = Float.parseFloat(args[1]);
		price = Float.parseFloat(args[2]);
		total = qty*price;
	   System.out.println("-------------------Wellcom To A1-Backery----------------");
	   System.out.println("Item"+item);
	   System.out.println("Quantity :"+qty);
	   System.out.println("Price: "+price);
	   System.out.println("Total Amount:"+total);
	   System.out.println("-------------------Thank You! Visit Again----------------");
	   
	   
		
	}
}
