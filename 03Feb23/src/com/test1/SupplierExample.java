package com.test1;

import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
		Supplier<String> ss=new Supplier<String>() {

			@Override
			public String get() {
				return "Hello";
			}
		};
		System.out.println(ss.get());
		/*
		 * lamba expression
		 */
		Supplier<String> s1=() ->"Hello World";
		System.out.println(s1.get());
	}

}
