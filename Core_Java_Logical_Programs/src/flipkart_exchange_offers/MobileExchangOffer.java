package flipkart_exchange_offers;

public class MobileExchangOffer 
{
	
	public static double getDiscount(double age ,double marketPrice)
	{
		
		double depreciatedAmount =0.0;
		if(age <= 1)
		  {
			depreciatedAmount = (marketPrice *20.0)/100.0;
		  }
		else if(age >1 && age<=2)
		{
			depreciatedAmount = (marketPrice*35.0)/100.0;
		}
		else if(age>2 && age <=3)
		{
			depreciatedAmount = (marketPrice*50.0)/100.0;
		}
		else
		{
			depreciatedAmount = (marketPrice*60.0)/100.0;
		}
		
		return depreciatedAmount;
	}
	
	public static double getFinalPrice(double mobilePrice , double discount)
	{
		double discountAmount = mobilePrice - discount;
		return discountAmount;
	}
     
}
