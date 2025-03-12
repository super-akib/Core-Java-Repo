package com.nit.multi_thread20_02_2024;

public class CoronaVaccineApp 
{
   public static void main(String[] args) throws InterruptedException
   {
	   User mohd=new User("Mohd", 22, true);
	   User akib=new User("Akib", 17, true);
    	Thread thread1=new Thread()
    	{
 		  public void run()
		  {
			if(mohd.isEligible())
			{
			   mohd.bookDose();
				if(mohd.isDoseBooked())
					{
						System.out.println("Dose booked Successfully for "+mohd.userName+" .");						
					}
					}
					else
					{
						System.out.println(mohd.userName+" is not eligible for the vaccine.");
					}
				}
			};
			
			Thread thread2=new Thread(){
				public void run()
				{
					if(akib.isEligible())
					{
						akib.bookDose();
						if(akib.isDoseBooked())
						{
							System.out.println("Dose booked Successfully for "+akib.userName+" .");						
						}
					}
					else
					{
						System.out.println(akib.userName+" is not eligible for the vaccine.");
					}
				}
			};
			thread1.start();
			thread1.join();
			thread2.start();

		}

	}