package exam;

public class Product
{
     String productName;
     double price;
     int quantity;
    
    
    public Product(String productName, double price, int quantity)
    {
		super();
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}


	double calculateTotalCost()
    {
    	return (this.price*this.quantity);
    }


	@Override
	public String toString() {
		return "Product [productName=" + productName + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	
}
