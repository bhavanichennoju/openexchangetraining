package com.exception;

import java.util.ArrayList;
import java.util.List;

public class ExceptionExample {

	public static void main(String[] args) {
		/*
		 * int a = 50 / 0;// ArithmeticException System.out.println(a);
		 */
		try {
			int a = 50 / 0;// ArithmeticException
			System.out.println(a); 
		} catch (Throwable e) {
			System.out.println("Something went wrong ArithmeticException occured");
		}
		/*
		 * String string = null; System.out.println(string.length());//
		 * NullPointerException
		 */
		try {
			String s1 = null;
			System.out.println(s1.length());
		} catch (NullPointerException e) {
			System.out.println("Something went wrong NullPointerException occured");
		}
		/*
		 * String s = "abc"; int i = Integer.parseInt(s);// NumberFormatException
		 */
		try {
			String s = "abc";
			int i = Integer.parseInt(s);
		} catch (NumberFormatException e) {
			System.out.println("Something went wrong NumberFormatException occured");
		}
		/*
		 * int[] myNumbers = {1, 2, 3}; myNumbers[10]=50;
		 * //ArrayIndexOutOfBoundsException
		 */
		try {
			int[] myNumber = { 1, 2, 3 };
			System.out.println(myNumber[10]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Something went wrong ArrayIndexOutOfBoundsException occured");
		} finally {
			System.out.println("The 'try catch' is finished.");//executed no matter if an exception is thrown or not...example..connection closing like that
		}
	}

}
