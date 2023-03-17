package com.test4;
class ThreadSecond implements  Runnable {
	
	public void run() {
		System.out.println("created thread");
	}
}
public class CreateThreadSecond {

	public static void main(String[] args) {
		ThreadSecond t1=new ThreadSecond();
		Thread thread=new Thread(t1);
		thread.start();

	}

}
