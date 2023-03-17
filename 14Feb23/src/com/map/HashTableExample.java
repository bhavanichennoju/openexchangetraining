package com.map;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

import data.Book;

public class HashTableExample {

	public static void main(String[] args) {
		Hashtable<Integer, Book> mapList = new Hashtable<Integer, Book>();
		Book b1 = new Book(1, "Delight-Class", 500);
		Book b2 = new Book(2, "java", 400);
		Book b3 = new Book(3, "C++", 570);
		mapList.put(1, b1);
		mapList.put(2, b2);
		mapList.put(3, b3);
		for (Map.Entry<Integer, Book> m : mapList.entrySet()) {
			System.out.println(m.getKey() + "   " + m.getValue());
		}
		mapList.remove(3);
		System.out.println(mapList);
		System.out.println(mapList.get(1));
		mapList.clear();
		
	}

}
