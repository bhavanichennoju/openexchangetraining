package com.stringclass;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Differentiate String == operator and equals() method

//		String s1="wavelabs";
//		String s2="wavelabs";
//		System.out.println(s1==s2);
//		System.out.println(s1.equals(s2));

		String s3 = new String("wavelabs");
		String s4 = new String("wavelabs");
		// == checks if the reference to string objects are equal or not.
		System.out.println(s3 == s4);// false
		// equals() checks if the content of the string object are equal.
		System.out.println(s3.equals(s4));// true

		// both are refering to the same object.
		String s6 = new String("wavelabs");
		String s5 = s6;
		System.out.println(s6 == s5);// true
		System.out.println(s6.equals(s5));// true

		// Escape character in Java Strings
		// String statemnet="this is "String" statement";//get error
		String statemnet = "this is \"String\" statement";
		System.out.println(statemnet);
	}
}
