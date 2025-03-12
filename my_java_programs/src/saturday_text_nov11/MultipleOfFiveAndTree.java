package saturday_text_nov11;

public class MultipleOfFiveAndTree {
    public static void isMultiple(int n)
    {
    	if(n%3==0 && n%5==0)
    	{
    		System.out.println("The "+n+"  given number is Multiple of both 3 and 5.");
    	}
    	else 
    		System.out.println("The "+n+" is not Multiple of both 3 and 5.");
    }
	public static void main(String[] args) {
		int num;
        num = Integer.parseInt(args[0]);
        isMultiple(num);
	}

}
