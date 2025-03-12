package exam_set_a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SortEmployeeDataUsingAPI 
{

	static final String JDBC_DRIVER ="oracle.jdbc.driver.OracleDriver";
    static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    static final String USER_NAME ="System";
    static final String PASSWORD ="akib";
    
    public static class Employee
    {
    	private int empId;
    	private String empName;
    	private int age;
    	private	String department;

    	public Employee (int empId,String empName,int age,String department)
    	{
    		this.empId = empId;
    		this.empName = empName;
    		this.age = age;
    		this.department = department;
    	}


    	public int getEmpId() {
    		return empId;
    	}


    	public void setEmpId(int empId) {
    		this.empId = empId;
    	}


    	public String getEmpName() {
    		return empName;
    	}


    	public void setEmpName(String empName) {
    		this.empName = empName;
    	}


    	public int getAge() {
    		return age;
    	}


    	public void setAge(int age) {
    		this.age = age;
    	}


    	public String getDepartment() {
    		return department;
    	}


    	public void setDepartment(String department) {
    		this.department = department;
    	}


    	@Override
    	public String toString() {
    		return "Employee [empId=" + empId + ", empName=" + empName + ", age=" + age + ", department=" + department
    				+ "]";
    	}


    }
    
    public static void main(String[] args) {
		
    	try {
    		
    		List<Employee>  list = new ArrayList<>();
    		
			Class.forName(JDBC_DRIVER);
			Connection con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			Statement stmt = con.createStatement();
			String selectQuery ="select * from employees";
		    ResultSet result= stmt.executeQuery(selectQuery);
			while(result.next())
			{
				Employee emp = new Employee(result.getInt(1),result.getString(2) ,result.getInt(3) ,result.getString(4));
				list.add(emp);
			}
			
			list.stream().filter(e-> e.age>=25 && ageIsPrime(e.getAge())&& e.empName.endsWith("a")||e.empName.endsWith("k")||e.empName.endsWith("e")).forEach(System.out::println);
			
		} catch (ClassNotFoundException | SQLException e) {
	
			e.printStackTrace();
		}
	}
    public static boolean ageIsPrime(int age)
    {
    	int count=0;
    	for(int i=2;i<=age/2;i++)
    	{
    		if(age%i==0)
    		{
    			count++;
    		}
    			
    	}
    	if(count==1)
    	{
    		return true;
    	}
    	return false;
    }
}
