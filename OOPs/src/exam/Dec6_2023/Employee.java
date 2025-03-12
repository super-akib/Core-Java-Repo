package exam.Dec6_2023;

public class Employee
{
  
	private int empId;
	private String empName;
	private  double empSalary;
	public void  setEmployee(int id ,String name, double salary)
	{
       
		this.empId = id;
		this.empName = name;
		this.empSalary = salary;
	}
	public void getDesignation()
	{    
		
		if(empSalary >= 50000)
		{ 
			System.out.println("Manager");
		}
		else if(empSalary < 50000 && empSalary >=30000)
		{
			System.out.println("Developer");
		}
		else
		{
			System.out.println("Tester");
		}
		
	}
	public void getEmployeeData()
	{
			System.out.println("-----------------------------");
			System.out.println("Id ="+empId);
			System.out.println("Name:"+empName);
			System.out.println("Salary:"+empSalary);
		
	}
}
