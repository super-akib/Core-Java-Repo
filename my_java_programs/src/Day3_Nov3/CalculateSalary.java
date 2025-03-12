package Day3_Nov3;

public class CalculateSalary {

	public static void main(String[] args) {
		float salary,HRA,CA,ET, total;
		salary = Float.parseFloat(args[0]);
		HRA =(salary*15)/100;
		CA = (salary*15)/100;
		ET = (salary*10)/100;
		total = salary + HRA + CA + ET ;
		System.out.println("Basic Salary is:"+salary);
		System.out.println("HRA is 15% of  Basic Salary which is: Rs"+HRA);
		System.out.println("Conveyence is 15% of Basic Salary which is: Rs "+CA);
		System.out.println("Entertainment Allowance is 10% of Basic Salary which is: Rs "+ET);
		System.out.println("Total Salary is: Rs"+total);
		

	}

}
