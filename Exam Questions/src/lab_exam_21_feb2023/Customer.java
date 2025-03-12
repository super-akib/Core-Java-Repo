package lab_exam_21_feb2023;

public class Customer implements Runnable
{
	private int availableSeat = 1;  
	private int wantedSeat ;
	
	public Customer(int wantedSeat) {
		super();
		this.wantedSeat = wantedSeat;
	}

	@Override
	public synchronized void run()
	{ 
		String name = Thread.currentThread().getName();
		
		try 
		{
		  if(availableSeat>= wantedSeat)
		  {
			System.out.println(name+" Reserved Sucessfully..");
			availableSeat = availableSeat- wantedSeat; 
	    	}
		  else
		  {
			throw new RuntimeException("no seat available..");
		  }
		  
	    }
		catch(RuntimeException e)
		{
			System.err.println(e);
		}
		}

}
