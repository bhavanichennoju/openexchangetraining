package com.test2;

public class ThreadExample2 extends Thread
{
    public static void main(String arg[])
    {
        System.out.println("Main method");
        System.out.println("The main thread is running :"+Thread.currentThread().getName());
        ThreadExample2 obj = new ThreadExample2();
       obj.start();
    }
    @Override
    public void run() 
    {
        System.out.println("Thread is running..."+Thread.currentThread().getName());
    }
}