package lab_22_02_2024;

public class SharedBuffer
{   
	private final int buffer_size=10;
    private  int arr[]= new int[buffer_size];
    private int index=0;
    private static int capacity=0;
    

    public  void produce() throws InterruptedException
    {
    	synchronized(this)
    	{
    		while(capacity<=buffer_size)
    		{		
    		  arr[index]= (int)(Math.random()*100);
    		  System.out.println("Produced No."+arr[index]);
    		  index = (index+1)%buffer_size;
    		  capacity++;
    		  if(capacity == buffer_size)
    		  {		
    			  wait();
    			  Thread.sleep(1000);
    		  } 
    		}
    	}
    }
    public void cunsume() throws InterruptedException
    {
    	synchronized (this)
    	{
    	  while(capacity !=0)
    	  {
    		 System.out.println("Consume No."+arr[index]);
    		 index  = (index+1)%buffer_size;
    		 capacity--;
    	  }
    	  if(capacity == 0)
    	  {
    		  wait();
          }
    	  notify();
    	} 
    }
}
