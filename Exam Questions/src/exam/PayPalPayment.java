package exam;

public class PayPalPayment implements PaymentMethod
{

	@Override
	public void processPayment(double amount) 
	{
		 if(amount>0)
		 {
			 System.out.println("PayPal payment processing...");
		 }
		 else
		 {
			 System.out.println("Invalide amount ...");
		 }
	}

}
