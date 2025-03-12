package exception_exam_31_01_24;

public class InsufficientQuantityException extends RuntimeException
{
    public InsufficientQuantityException(String errorMessage)
    {
    	super(errorMessage);
    }
    
}
