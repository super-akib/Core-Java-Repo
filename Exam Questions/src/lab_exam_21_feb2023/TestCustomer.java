package lab_exam_21_feb2023;

public class TestCustomer
{
    public static void main(String[] args)
    { 
		Customer  c1 = new Customer(1);
		
		
		Thread raj = new Thread(c1,"raj");
		Thread vishal = new Thread(c1,"vishal");
		
		raj.start();
		vishal.start();
	
	}
}
