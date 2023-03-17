package com.stringclass;

public class StringExample {
	public static void main(String[] args) {

		String name = "wavelabs...";
		System.out.println("String: " + name);
		//length  of String
		int length = name.length();
		System.out.println("Length: " + length);
		//Join Two Java Strings
		String first="java";
		String second="programming";
		System.out.println(first.concat(second));
		System.out.println(first+second);
		// Compare two Strings
		String s1="java";
		String s2="Java";
		String s3="Java";
		 System.out.println( s1.equals(s2));
		 System.out.println(s2.equals(s3));
	}
}
