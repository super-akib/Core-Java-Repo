package model.content;

public class Customer 
{
    private int CustomerID;
    private String FirstName;
    private String LastName;
    private String  Email;
    private long PhoneNumber;
    private String Address;
    private	String Username;
    private String Password;
    private String RegistrationDate;
	public Customer(int customerID, String firstName, String lastName, String email, long phoneNumber, String address,
			String username, String password, String registrationDate)
	{
		super();
		CustomerID = customerID;
		FirstName = firstName;
		LastName = lastName;
		Email = email;
		PhoneNumber = phoneNumber;
		Address = address;
		Username = username;
		Password = password;
		RegistrationDate = registrationDate;
	}
    
	public void Authanticat()
	{
		
	}
    
	

}
