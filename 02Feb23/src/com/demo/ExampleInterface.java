package com.demo;

public interface ExampleInterface {
	
	abstract void hello();
	
	default void welcome() {
	System.out.println("default method");
	}
	
	static void greeting() {
		System.out.println("static method");
	}

}
