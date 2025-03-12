package day2_Lab;

public class TeaCafe {
	public static void main(String args[]) {
		String item;
		float price,total,qty;
		item = args[0];
		qty = Float.parseFloat(args[1]);
		price = Float.parseFloat(args[2]);
		total = qty*price;
	   System.out.println("-------------------TeaCaffe----------------");
	   System.out.println("Item"+item);
	   System.out.println("Quantity :"+qty);
	   System.out.println("Price: "+price);
	   System.out.println("Total Amount:"+total);
	   System.out.println("-------------------Thank You! Visit Again----------------");
	   
	   
		
	}
}
