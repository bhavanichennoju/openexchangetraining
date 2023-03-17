package com.thread;

public class JoinExample extends Thread {
	public void run() {
		for (int i = 1; i <= 4; i++) {
			try {
				System.out.println(Thread.currentThread().getName() +"  "+i);
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

	public static void main(String args[]) {
		JoinExample th1 = new JoinExample();
		JoinExample th2 = new JoinExample();
		JoinExample th3 = new JoinExample();
		th1.start();
		try {
			th1.join();// one thread to wait until the other thread to finish its execution
		} catch (Exception e) {
			System.out.println(e);
		}

		th2.start();
		th3.start();
	}
}
