package com.thread;
class ExampleThread extends Thread{
	public void run() {
		for(int i=1;i<=2;i++) {
			System.out.println(Thread.currentThread().getName()+ "  "+i);
		}
		
		
	}
}
public class ThreadExample {
	public static void main(String[] args) {
		Thread t1=new ExampleThread();
		Thread t2=new ExampleThread();
		Thread t3=new ExampleThread();
		 t1.setPriority(10);    
		t1.start();
		t2.setPriority(5);    
		t2.start();
		t3.setPriority(1);    
		t3.start();
		
	}
}
