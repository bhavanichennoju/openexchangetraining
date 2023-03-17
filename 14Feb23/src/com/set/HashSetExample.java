package com.set;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.Spliterator;
import java.util.stream.Stream;

import data.Book;

public class HashSetExample {

	public static void main(String[] args) {
		Set<Book> listOfBooks = new HashSet<>();
		Book b1 = new Book(1, "Delight-Class", 500);
		Book b2 = new Book(2, "java", 400);
		Book b3 = new Book(3, "C++", 570);
		listOfBooks.add(b1);
		listOfBooks.add(b2);
		listOfBooks.add(b2);
		System.out.println(listOfBooks);//no duplicates are allowed
		//listOfBooks.remove(b1);
		System.out.println(listOfBooks);
		
		for(Book b:listOfBooks){  
		    System.out.println(b.getBookName());  
		    } 
		  System.out.println(".......................");
		/*
		 * iterator()
		 */
		Iterator iterator=listOfBooks.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		  System.out.println(".......................");
		/*
		 * for each
		 */
		  System.out.println(".......................");
		for(Book b:listOfBooks) {
			System.out.println(b);
		}
		/*
		 * using stream
		 */
		  System.out.println(".......................");
	    listOfBooks.stream().forEach(x -> System.out.print(x));
		
		/*
		 * set to array
		 */
	    Book[] myArray =listOfBooks.toArray(new Book[listOfBooks.size()]);
	    for(int i=0;i<myArray.length;i++) {
	    	System.out.println(myArray[1]);
	    }
	    System.out.println(".......................");
	 
	   
	}

}
