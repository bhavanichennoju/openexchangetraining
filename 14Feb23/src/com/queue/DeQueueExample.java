package com.queue;

import java.util.ArrayDeque;

public class DeQueueExample {

	public static void main(String[] args) {
		ArrayDeque<String> languages = new ArrayDeque<String>(2);

		languages.add("English");
		languages.addFirst("Hindi");
		languages.addLast("French");
		languages.add("tamil");

		System.out.println("ArrayDeque: " + languages); 
		System.out.println(languages.size());
		//act as stack...last in first out
		ArrayDeque<Integer> numbers = new ArrayDeque<Integer>();

		numbers.push(50);
		numbers.push(100);
		numbers.push(56);
		numbers.push(34);
		System.out.println(numbers);//[34, 56, 100, 50]
		numbers.pop();
		System.out.println(numbers);//[56, 100, 50]
	}

}
