package lab_exam_20_feb2024;

public class CalculationBase 
{
    protected int num1;
    protected int num2;
	
    public CalculationBase(int num1, int num2)
    {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
    
    public void performCalculation()
    {
    	System.out.println("Addition of Two No.:"+(num1+num2));
    }
    
}
