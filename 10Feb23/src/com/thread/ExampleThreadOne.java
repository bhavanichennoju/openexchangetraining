package com.thread;

public class ExampleThreadOne extends Thread{

	@Override
	public void run() {
		 System.out.println ("Thread First");
		for (int i = 1; i <= 2; i++) {
			Thread.yield();
			/*
			 * // By calling this method, 
			 * ExampleThreadOne stop its execution and
			 *  giving a chance to a main thread
			 */
			System.out.println(Thread.currentThread().getName() + "  " + i+" thread first");
		}
		 System.out.println ("Thread First Completed.");
	}
}
