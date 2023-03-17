package com.test;
//When more than one classes inherit a same class then this is called hierarchical inheritance. For example class B, C and D extends a same class A
class A{
	void methodA() {
		System.out.println("A");
	}
}
class B extends A {
	void methodB() {
		System.out.println("B");
	}
}
class C extends A{
	void methodC() {
		System.out.println("C");
	}
}
class D extends A{
	void methodD() {
		System.out.println("D");
	}
}



public class HierarchicalInheritance {
	public static void main(String[] args) {
		D d=new D();
		d.methodD();
		d.methodA();
	

	}
}
