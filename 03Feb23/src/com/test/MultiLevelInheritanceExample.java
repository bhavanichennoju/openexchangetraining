package com.test;

//multilevel inheritance ...In multilevel inheritance, a subclass extends from a superclass and then the same subclass acts as a superclass for another class. 
class SuperClassM {

	void display() {

		System.out.println("display method");
	}
	
	void m1() {
		System.out.println("grand parent");
	}

}

class SubClassM extends SuperClassM {
	void message() {

		System.out.println("message method");
	}

	void display() {

		System.out.println("display method in sub class");
	}
	void m2() {
		System.out.println(" parent");
	}

}

class SubClass2 extends SubClassM {
	void message() {

		System.out.println("message method 2");
	}

	void display() {

		System.out.println("display method in sub class 2");
	}
	void m3() {
		System.out.println("child");
	}

}

public class MultiLevelInheritanceExample {

	public static void main(String[] args) {
		SubClass2 scc=new SubClass2();
		scc.message();
		scc.display();
		scc.m1();
		scc.m2();
		scc.m3();

	}

}
