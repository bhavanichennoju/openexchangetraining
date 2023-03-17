package com.vector;

import java.util.Iterator;
import java.util.Vector;

public class VectorClassExample {

	public static void main(String[] args) {
		Vector<String> names=new Vector<>();
		/*
		 *  adds an element to vectors
		 *  
		 */
		names.add("bhavani");
		names.add("akash");
		names.add("tinku");
		System.out.println(names);//[bhavani, akash, tinku]
		/*
		 * adds an element to the specified position
		 */
		names.add(1, "Ishu");
		System.out.println(names);//[bhavani, Ishu, akash, tinku]
		System.out.println("...............................");
		/*
		 *  adds all elements of a vector to another vector
		 */
		Vector<String> numbers=new Vector<>();
		numbers.add("pallavi");
		numbers.add("nagesh");
		System.out.println(numbers);
		names.addAll(numbers);
		System.out.println(names);
		System.out.println("...............................");
		/*
		 *  - returns an element specified by the index
		 */
		System.out.println(names.get(4));
		System.out.println("...............................");
		/*
		 * iterator() - returns an iterator object to sequentially access vector elements
		 */
		Iterator<String> iterator=names.iterator();
		while(iterator.hasNext()) {
			String object=iterator.next();
			System.out.println(object);
			
		}
		System.out.println("...............................");
		/*
		 * remove(index) - removes an element from specified position
		 */
		names.remove(4);//name - pallavi will remove
		System.out.println(names);
		/*
		 * size of vector
		 */
		System.out.println(names.size());
		System.out.println("...............................");
		Vector<String> newList=new Vector<>(5);
		System.out.println(newList.capacity());
	}

}
