package com.thread;

public class ExampleThreadMain {
	public static void main(String[] args) throws InterruptedException {
		// here ,created 2 threads
		/*
		 * life cycle of thread...Thread new state
		 */
		ExampleThreadOne t1 = new ExampleThreadOne();
		ExampleThreadSecond t2 = new ExampleThreadSecond();
		// now threads will be runnable state

		// running state
		t1.setPriority(4);
		t2.setPriority(8);
		t1.start();
		t2.start();
	}

}
