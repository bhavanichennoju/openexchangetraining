package com.wavelabs;

public class Test { 
    static {
        System.out.println("static block executed");
    }
 
    {
        System.out.println("block executed");//instance block
    }
 
    public Test() {
        System.out.println("constructor executed");
    }
 
    public void fun() {
        System.out.println("fun executed");
    }
 
    public static void main(String args[ ])  {
    	// Test test=new Test();
        System.out.println("main started");
        Test test=new Test();
        test.fun();
 
    } 
} 