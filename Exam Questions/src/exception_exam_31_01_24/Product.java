package exception_exam_31_01_24;

public class Product 
{
    String productName;
    int availableQuantity;
    double price;
	
    public Product(String productName, int availableQuantity, double price) 
    {
		super();
		this.productName = productName;
		this.availableQuantity = availableQuantity;
		this.price = price;
	}
    public void rocessOrder(int quantity, double amount)
    {
    	try
    	{
    		
    	double totalPrice = price * quantity;
    	if(amount < totalPrice)
    	{   
    		throw new InvalidAmountException("Insufficient amount .....");
    	}
    	else if(amount > totalPrice)
    	{
    		throw new InsufficientQuantityException("Insufficient Quantity..");
    	}
    	else
    	{
    		System.out.println("Product Name:"+productName);
    		System.out.println("Price:"+price+" ,QTy:"+quantity);
    		System.out.println("Total Bill Amount:"+totalPrice);
    	}
      }
      catch(InvalidAmountException | InsufficientQuantityException e2)
     {
    	 System.err.println(e2.getMessage());   
     }
    	
    	
    }
    
}
