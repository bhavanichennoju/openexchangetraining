package com.exception;

/*
 * If you have multiple catches, you have to maintain the hierarchy from subclass to superclass.
 */
public class MutlipleCatchBlockExample {
	public static void main(String[] args) {
		try {
			//String s = null;
			//System.out.println(s.length());
			System.out.println(4 / 0);
		}
		catch (ArithmeticException e) {
			System.out.println("ArithmeticException :divide by 0");
		} catch (NullPointerException e) {
			System.out.println("NullPointerException ");
		} 
		finally {
			System.out.println("Conncetion closing.......");
		}
	}
}
