package flipkart_exchange_offers;

import java.util.Scanner;

public class FlipkartExchangeOfferOnMobiles
{
    public static void main(String[] args) 
    {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.print("Enter new mobile phome name:");
    	String newMobileName = sc.nextLine();
    	System.out.print("Enter mobile price:");
    	double mobilePrice = sc.nextDouble();
    	System.out.print("Enter your Old Phone name:");
    	String oldPhoneName = sc.nextLine();
    	oldPhoneName = sc.nextLine();
       	System.out.print("Enter current market price:");
    	double marketPrice = sc.nextDouble();
    	System.out.println("Enter age of mobile:");
    	double age = sc.nextDouble();
    	
    	double depreciatedAmount = MobileExchangOffer.getDiscount(age, marketPrice);
    	double totalAmount = MobileExchangOffer.getFinalPrice(mobilePrice, depreciatedAmount);
    	
    	System.out.println("*******************************");
    	System.out.println("Your "+oldPhoneName+" phone price Rs. "+marketPrice);
    	System.out.println("Depreciation of old mobile : "+depreciatedAmount);
    	System.out.println("New Phone :"+newMobileName);
    	System.out.println("Price :"+mobilePrice);
    	System.out.println("After Discount Total Cost:"+totalAmount);
    	System.out.println("*******************************");
    	sc.close();
    	
	} 
	
}
