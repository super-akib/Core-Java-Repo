package lab_exam_20_feb2024;

public class AdvancedCalculation extends CalculationBase
{
	
	protected double additionalNum;
	protected String operation;
	
	public AdvancedCalculation(int num1, int num2, double additionalNum, String operation)
	{
		super(num1, num2);
		this.additionalNum = additionalNum;
		this.operation = operation;
	}
	
	public void performAdvancedCalculation()
	{
		System.out.println(num1+num2+additionalNum+operation);
	}

}
