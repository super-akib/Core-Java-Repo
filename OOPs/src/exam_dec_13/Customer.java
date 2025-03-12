package exam_dec_13;

public class Customer 
{
	private String customerName;
	private int  customerId;
	private String emailAddress;
	
	public Customer(String customerName, int customerId, String emailAddress)
	{
		super();
		this.customerName = customerName;
		this.customerId = customerId;
		this.emailAddress = emailAddress;
	}
	
	public Customer(Customer c1)
	{
		this.customerName = c1.customerName;
		this.customerId = c1.customerId;
		this.emailAddress = c1.emailAddress;	
	}

	public String getCustomerName() 
	{
		return customerName;
	}

	public int getCustomerId()
	{
		return customerId;
	}
	public String getEmailAddress() 
	{
		return emailAddress;
	}
 
	public String changeEmail(String email)
	{
		return this.emailAddress = email;
	}

	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerId=" + customerId + ", emailAddress="
				+ emailAddress + "]";
	}
	
	
	
}
