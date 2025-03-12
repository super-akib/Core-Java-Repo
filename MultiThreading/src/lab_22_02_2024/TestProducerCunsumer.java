package lab_22_02_2024;

public class TestProducerCunsumer
{
     public static void main(String[] args) throws InterruptedException
     {
		 SharedBuffer  buffer = new SharedBuffer();
		 
			 Thread produce = new Thread(()-> 
			 {
				try {
					buffer.produce();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			});
			 
			 Thread consume = new Thread(()-> 
			 {
				try {
					buffer.cunsume();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			});
			 
			 produce.start();
			 //produce.join();
			 consume.start();
	  }
		 
}
