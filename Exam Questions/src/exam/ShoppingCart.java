package exam;

public class ShoppingCart
{    
	
	  double total;
	  
	 
	
	public ShoppingCart(double total) {
		super();
		this.total = total;
	}
	public void addProduct(Product product)
	{
		System.out.println(product);
	}
	public void viewTotalCost()
	{
		System.out.println("Total cost:"+this.total);
	}
	public void checkout(PaymentMethod paymentMethod)
	{
		System.out.println("Payment is Successful..");
	}
}
