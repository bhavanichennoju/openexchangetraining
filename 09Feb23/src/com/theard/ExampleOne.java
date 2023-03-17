package com.theard;
class RunnableExample implements Runnable{

	@Override
	public void run() {
	try {
		System.out.println(Thread.currentThread().getName());
	}catch(Exception e){
		
		System.out.println(e.toString());
	}
		
	}
	
}
public class ExampleOne {

	public static void main(String[] args) {
		 int n = 3; 
		    for (int i = 0; i < n; i++) {
		    RunnableExample r1=	new RunnableExample();
		      Thread obj= new Thread(r1);
		      obj.start();
		    }

	}

}
