package lab_19_02_2024;

class TickTock {
	int count;//100000
	public synchronized void increment()
	{
		count++;
	}
}
class NewPlatForm8 {
	public static void main(String[] args) throws Exception
	{
		TickTock tt = new TickTock();
		Thread t1 = new Thread(new Runnable() {
			public void run()
			{
				for (int i = 0; i < 100000; i++) {
					tt.increment();
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {
			public void run()
			{
				for (int i = 0; i < 100000; i++) {
					tt.increment();
				}
			}
		});
                t1.start();
                t1.join();
		t2.start();
//		t1.join();
//		t1.join();
		
		System.out.println("Count : " + tt.count);
	}
}