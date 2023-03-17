package com.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import data.Book;

public class HashMapExample3 {

	public static void main(String[] args) {
		/*
		 * Insertion order is preserved in LinkedHashMap.
		 */
		Map<Integer, Book> mapList = new LinkedHashMap<Integer, Book>();
		Book b1 = new Book(1, "Delight-Class", 500);
		Book b2 = new Book(2, "java", 400);
		Book b3 = new Book(3, "C++", 570);
		// put() method to add elements
		mapList.put(1, b1);
		mapList.put(3, b3);
		mapList.put(2, b2);
		for (Map.Entry<Integer, Book> m : mapList.entrySet()) {
			System.out.println(m.getKey() + "   " + m.getValue());
		}
		System.out.println("...........................................");
		/*
		 * Insertion order in HashMap is not preserved.
		 */
		Map<Integer, Book> mapList1 = new HashMap<Integer, Book>();
		Book b11 = new Book(1, "Delight-Class", 500);
		Book b12 = new Book(2, "java", 400);
		Book b13 = new Book(3, "C++", 570);
		mapList1.put(1, b11);
		mapList1.put(3, b13);
		mapList1.put(2, b12);
		mapList1.put(4, b12);
		for (Map.Entry<Integer, Book> m : mapList1.entrySet()) {
			System.out.println(m.getKey() + "   " + m.getValue());
			System.out.println(m.hashCode());
		}
	}

}
