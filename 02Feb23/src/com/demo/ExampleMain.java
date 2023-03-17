package com.demo;

public class ExampleMain implements ExampleInterface{

	public static void main(String[] args) {
      ExampleMain em=new ExampleMain();
      em.hello();
      em.welcome();
      ExampleInterface.greeting();

	}

	@Override
	public void hello() {
		System.out.println("abstract method");
		
	}

}
