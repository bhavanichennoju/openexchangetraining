package com.test1;

public class RunnableExample implements Runnable{

    @Override
    public void run() {
        System.out.println("Inside the run method ");
    }

    public static void main(String[] args ) {
    	RunnableExample r1=new RunnableExample();
        Thread thread = new Thread(r1);
        thread.start();

    }
}
