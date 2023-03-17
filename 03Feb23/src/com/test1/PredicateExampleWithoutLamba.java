package com.test1;

import java.util.function.Predicate;

public class PredicateExampleWithoutLamba {

	public static void main(String[] args) {
		Predicate<String> ps=new Predicate<String>() {
			String stringOne = "Hello";
			@Override
			public boolean test(String t) {
				return stringOne.equals(t);
			}
		};
		System.out.println(ps.test("hi"));
		System.out.println(ps.test("Hello"));

	}

}
