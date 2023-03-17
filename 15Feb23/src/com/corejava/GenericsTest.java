package com.corejava;

public class GenericsTest {
	public static void main(String[] args) {

		Integer i = 20;

		Myclass<Integer> obj = new Myclass<Integer>(i);

		System.out.println("Stored value: " + obj.getObject());

		Double d = 20.25;
		Myclass<Double> obj2 = new Myclass<Double>(d);
		System.out.println("Stored value: " + obj2.getObject());

		String str = "Scientech Easy";
		Myclass<String> obj3 = new Myclass<String>(str);
		System.out.println("Stored value: " + obj3.getObject());
	}
}