package com.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import data.Book;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		Set<Book> listOfBooks = new LinkedHashSet<>();
		Book b1 = new Book(1, "Delight-Class", 500);
		Book b2 = new Book(2, "java", 400);
		Book b3 = new Book(3, "C++", 570);
		listOfBooks.add(b1);
		listOfBooks.add(b2);
		listOfBooks.add(b3);
		System.out.println(listOfBooks);

	}

}
