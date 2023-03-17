package com.theard;

public class ThreadExample implements Runnable  
{
    public static void main(String arg[])
    {
        System.out.println("Main method");
        System.out.println("The main thread is running :"+Thread.currentThread().getName());
        ThreadExample obj = new ThreadExample();
        Thread t1 = new Thread(obj);
        t1.start();
    }
    @Override
    public void run() 
    {
        System.out.println("Thread is running..."+Thread.currentThread().getName());
    }
}
