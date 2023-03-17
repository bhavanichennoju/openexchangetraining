package com.test4;

class ThreadOne extends Thread{
	public void run() {
		System.out.println("created thread");
	}
}

public class CreateThreadOne {

	public static void main(String[] args) {
	    ThreadOne threadOne=new ThreadOne();
	    threadOne.start();

	}

}
