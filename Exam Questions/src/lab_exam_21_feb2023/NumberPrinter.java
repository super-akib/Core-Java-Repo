package lab_exam_21_feb2023;

public class NumberPrinter 
{
   private int num;
   
   
	public NumberPrinter(int num) {
	super();
	this.num = num;
}
	public synchronized void printPrime()
	{
		  for(int i=2 ;i<=num/2;i++)
		  {
			  if(num/i ==0)
			  {
				  System.out.print(i+" prime ");
			  }
		  }
	}
	public synchronized void printEven()
	{
		 for(int i=1;i<=num;i++)
		 {
			 if(i%2==0)
			 {
				 System.out.println(i+" even number");
			 }
		 }
	}
	
	
}
