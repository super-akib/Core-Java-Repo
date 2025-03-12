package lab_exam_21_feb2023;

public class DaemonThreadDemo 
{
	public static void main(String[] args)
	   {
		   Thread thread = new Thread(()->
		   {   
		        
			   System.out.println("userThread:"+Thread.currentThread().getName());
		   });
		   Thread damon = new Thread(()->
		   {   
		       System.out.println("Daemon Thread exit");
		   });
		   thread.start();
		   damon.setDaemon(true);
		   damon.start();
		    
	    }
   
}
