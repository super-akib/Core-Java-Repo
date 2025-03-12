package lab_exam_21_feb2023;

public class Testmain 
{
   public static void main(String[] args)
   {
	  NumberPrinter  num = new NumberPrinter(100);
	  Runnable r1 = new Runnable()
	  {		  
			@Override
			public void run()
			{
				num.printPrime();
				num.printEven();
			}	
	  };
	  	  
	  Thread t = new Thread(r1);
	  t.start();
	  
	  
   }
}  
