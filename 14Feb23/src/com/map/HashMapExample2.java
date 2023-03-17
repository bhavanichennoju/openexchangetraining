package com.map;

import java.util.HashMap;
import java.util.Map;

import data.Book;

public class HashMapExample2 {

	public static void main(String[] args) {
		  Map<Integer,Book> mapList=new HashMap<Integer,Book>(); 
		  Book b1=new Book(1, "Delight-Class", 500);
		  Book b2=new Book(2, "java", 400);
		  Book b3=new Book(3, "C++", 570);
		// put() method to add elements
		  mapList.put(1, b1);
		//  mapList.put(2, b2);
		  mapList.put(3, b3);
		  mapList.put(2, b2);
		  for(Map.Entry<Integer,Book> m:mapList.entrySet()) {
			  System.out.println(m.getKey()+"   "+m.getValue());
		  }
		 // get() method to get value
		  System.out.println(mapList.get(2));
		  /*
		   * return set view of keys,using keySet()
		   */
		  System.out.println(mapList.keySet());
		  System.out.println(mapList.values());
		  /*
		   *  change element with key 2
		   */
		mapList.replace(3, new Book(3, "C Lang", 760));
		 for(Map.Entry<Integer,Book> m:mapList.entrySet()) {
			  System.out.println(m.getKey()+"   "+m.getValue());
		  }
		 // iterate through keys only
		 for(Integer in:mapList.keySet()) {
			  System.out.println(in);
		  }
		 // iterate through values 
		 for(Book b:mapList.values()) {
			  System.out.println(b.getBookName());
		  }
	}

}
