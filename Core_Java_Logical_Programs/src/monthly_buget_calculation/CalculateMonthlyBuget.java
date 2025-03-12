package monthly_buget_calculation;

public class CalculateMonthlyBuget
{
    public static void calculateMonthlyBuget(double salary)
    {
    	// Calculate the amount spent on food 
    	
    	double food = (50.0*salary)/100.0;
    	
    	// Calculate the amount spent on PG
    	double pg = (1.0 / 15)*salary;
    	
    	//activities like shopping ,party,outing etc
    	double activities = (1.0/10)*salary;
    	
    	//Calculate total amount spend
    	double totalAmount = food + pg + activities;
    	
    	//calculate saved amount on salary
    	double savedAmount = salary - totalAmount;
    	
    	System.out.println("MONTHLY-BUGET:\n---------------");
    	
    	System.out.println("Monthly Salary is :Rs."+salary);
    	System.out.println("Amount spent on food is:Rs."+food);
    	System.out.println("Amount spent of PG is:Rs."+pg);
    	System.out.println("Amount spent on Activities is:Rs."+activities);
    	System.out.println("Total spent money is:Rs."+totalAmount);
    	System.out.println("Saving amount is :Rs."+savedAmount);
    	
    }
	
}
