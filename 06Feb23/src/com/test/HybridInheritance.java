package com.test;
//Hybrid inheritance is a combination of two or more types of inheritance
class GrandParent{
	void land() {
		System.out.println("this land belong to grand father");
	}
	void m1() {
		System.out.println("m1 method");
	}
	
}

class Parent extends GrandParent{
	void land() {
		System.out.println("this land belong to father");
	}
	void m2() {
		System.out.println("m2 method");
	}
	
}

class ChildSon extends Parent{
	
	void land() {
		System.out.println("this land belong to son");
	}
	void m3() {
		System.out.println("m3 method");
	}
}
class ChildDaughter extends Parent{
	
	void land() {
		System.out.println("this land belong to daughter");
	}
	void m4() {
		System.out.println("m4 method");
	}
}



public class HybridInheritance {

	public static void main(String[] args) {
		ChildSon cs=new ChildSon();
		cs.land();
		cs.m3();
//		ChildDaughter cd=new ChildDaughter();
//		cd.land();
//		cd.m4();
		

	}

}
