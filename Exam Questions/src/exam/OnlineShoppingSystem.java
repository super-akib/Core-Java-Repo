package exam;

public class OnlineShoppingSystem 
{

	public static void main(String[] args) 
	{
		Product  product = new Product("OnePlus 12", 75000, 5);
		ShoppingCart  shop = new ShoppingCart(375000);
		shop.viewTotalCost();
		shop.addProduct(product);
		CreditCardPayment credit = new CreditCardPayment();
		credit.processPayment(375000);
		
		PayPalPayment  pay = new PayPalPayment();
		pay.processPayment(375000);
	}

}
