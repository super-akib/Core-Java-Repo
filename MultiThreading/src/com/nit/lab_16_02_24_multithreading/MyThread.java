package com.nit.lab_16_02_24_multithreading;
/*
 Display a program to execute two task concurrently
  * task 1- Display 1-10
  * task 2-Display 10-20
  * task 2-Display 20-30 
 */

public class MyThread {
	public static void main(String[] args) {

		Runnable r1 = () -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println(Thread.currentThread().getName() + " i value is:" + i);
			}
		};

		Runnable r2 = () -> {
			for (int i = 10; i <= 20; i++) {
				System.out.println(Thread.currentThread().getName() + " i value is:" + i);
			}
		};
		Runnable r3 = () -> {
			for (int i = 20; i <= 30; i++) {
				System.out.println(Thread.currentThread().getName() + " i value is:" + i);
			}
		};

		Thread t1 = new Thread(r1, "task-1");
		Thread t2 = new Thread(r2, "task-2");

		Thread t3 = new Thread(r3, "task-3");
		t1.start();
		t2.start();
		t3.start();

	}
}
