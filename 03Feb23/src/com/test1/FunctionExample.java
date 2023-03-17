package com.test1;

import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {
		Function<String, String> fs=new Function<String, String>() {
			
			@Override
			public String apply(String t) {
				String b=t.toUpperCase();
				return b;
			}
		};
		System.out.println(fs.apply("hello"));
		System.out.println(fs.apply("welcome"));

	
	/*
	 * lamba
	 */
		Function<String, String> fs1=(t) ->t.toUpperCase();
		System.out.println(fs1.apply("hello"));
		System.out.println(fs1.apply("welcome"));
	}

}
