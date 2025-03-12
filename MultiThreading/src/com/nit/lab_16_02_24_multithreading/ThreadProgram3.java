package com.nit.lab_16_02_24_multithreading;

import java.util.Scanner;

/*
 Develop a program to display value 1-x from multiple threads concurrently
 take x value from other programmer whoever starting the thread Executing
  different logic from multiple thread concurrently.
*/
class Logic implements Runnable
{
    private int x;
    public  Logic(int x)
    {
    	this.x = x;
    }
	
	@Override
	public void run() {
		for(int i=1;i<=x;i++)
		 {
			System.out.println(Thread.currentThread().getName()+" = "+i); 
		 }
	}
}
public class ThreadProgram3 
{
     public static void main(String[] args)
     {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter x value:");
		 int x = sc.nextInt();
		 Logic logic = new Logic(x);
		 for(int i=1 ; i<=5;i++)
		 {
			 Thread thread = new Thread(logic);
			 thread.start();
		 }
		  sc.close();
	 }
}
