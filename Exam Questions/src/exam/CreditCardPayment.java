package exam;

public class CreditCardPayment  implements PaymentMethod
{

	@Override
	public void processPayment(double amount) 
	{
		  if(amount >0)
		  {
			  System.out.println("Amount is Passed..");
		  }
		  else
		  {
			  System.out.println("Invalide Amount.... ");
		  }
	}
	

}
