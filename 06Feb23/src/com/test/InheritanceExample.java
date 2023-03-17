package com.test;
//single inheritance..In single inheritance, a single subclass extends from a single superclass
class SuperClass {

	void display() {

		System.out.println("display method");
	}

}

class SubClass extends SuperClass {
	void message() {

		System.out.println("message method");
	}
	
void display() {
		
		System.out.println("display method in sub class");
	}
}

public class InheritanceExample {

	public static void main(String[] args) {
		SubClass sc=new SubClass();
		sc.display();
		sc.message();

	}

}
