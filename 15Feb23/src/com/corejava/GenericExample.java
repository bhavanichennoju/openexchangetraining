package com.corejava;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {

	public static void main(String[] args) {
		/*
		 * without generics requires casting:
		 */
		List list = new ArrayList();
		list.add("hello");
		String s = (String) list.get(0);
		System.out.println(s);
		/*
		 * to use generics, the code does not require casting:
		 */
		List<String> list1 = new ArrayList<String>();
		list1.add("hello");
		String s1 = list1.get(0); 
		System.out.println(s1);
	}

}
