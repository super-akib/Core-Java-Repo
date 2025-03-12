package exam.Dec6_2023;
import java.util.Scanner;
public class EmployeeDetails {

	public static void main(String[] args) {
		
		Employee  e1 = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Employe Id:");
		int id = sc.nextInt();
		System.err.print("Enter Employee Name:");
		String name =  sc.next();
		System.out.print("Enter Salary:");
		double salary = sc.nextDouble();
		e1.setEmployee(id,name,salary);
	    e1.getEmployeeData();
	    e1.getDesignation();
		sc.close();
		
		
	}

}
