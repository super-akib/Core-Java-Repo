package exception_exam_31_01_24;

public class InvalidAmountException extends Exception
{
    
	public InvalidAmountException(String errorMessage)
	{
		super(errorMessage);
	}
	
}
