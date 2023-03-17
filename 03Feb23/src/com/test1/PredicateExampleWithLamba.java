package com.test1;

import java.util.function.Predicate;

public class PredicateExampleWithLamba {

	public static void main(String[] args) {
		String stringOne="Hello";
		Predicate<String> ps=(t)->stringOne.equals(t);		
		System.out.println(ps.test("hi"));
		System.out.println(ps.test("Hello"));

	}

}
