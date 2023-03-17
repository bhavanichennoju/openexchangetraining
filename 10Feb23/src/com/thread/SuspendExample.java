package com.thread;

public class SuspendExample extends Thread  
{    
    public void run()  
    {    
        for(int i=1; i<=2; i++)  
        {    
            try  
            {  
                 sleep(500);  
                 System.out.println(Thread.currentThread().getName() +"  "+ i);    
            }catch(Exception e){
            	System.out.println(e);
            	}        
        }    
    }    
    public static void main(String args[])  
    {     
        SuspendExample t1=new SuspendExample ();    
        SuspendExample t2=new SuspendExample ();   
        SuspendExample t3=new SuspendExample ();   
        // call run() method   
        t1.start();  
       t2.start();  
        // suspend t2 thread   
       t2.suspend();   
        // call run() method   
       t3.start();  
       t2.resume();
    }    
}  