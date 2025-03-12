package lab_exam_21_feb2023;

import java.util.Scanner;

public class MultipleThreadDemo 
{
    public static void main(String[] args) 
    { 
    	Scanner sc =new Scanner(System.in);
	    System.out.print("Enter x value:");
	    int x = sc.nextInt();
	    
	     Runnable r1= new Runnable() 
	     {
			@Override
			public void run() {
				for(int i =1;i<=x;i++)
				{
					System.out.println(Thread.currentThread().getName()+"  value i"+i);
				}
			   	
			}
		};
	    
	    for(int i=1;i<=x;i++)
	    {
	    	Thread t1 = new Thread(r1);
	    	t1.start();
	    }
	    sc.close();
    	
	}
}
