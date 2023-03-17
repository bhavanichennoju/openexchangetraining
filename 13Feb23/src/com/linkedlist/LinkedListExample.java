package com.linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("bhavani");
		list.add("ramya");
		list.add("hanvi");
		list.add("pinky");
		list.add("pinky");
		list.add("tinku");
		list.add("vikram");
		list.addLast("vicky");
		list.addFirst("roja");
		System.out.println(list);
		System.out.println(list.get(0));
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		Iterator<String> iterator2 = list.iterator();
		while (iterator2.hasNext()) {
			System.out.print(iterator2.next() + " ");
		}
		// Remove first and last element
		list.removeFirst();
		list.removeLast();
		System.out.println();
		System.out.println(".....................");
		System.out.println("deletion of first and last element: " + list);
		// addAll
		LinkedList<String> llistobj = new LinkedList<String>();
		ArrayList<String> arraylist = new ArrayList<String>();
		arraylist.add("data1");
		arraylist.add("data2");
		llistobj.addAll(arraylist);
		System.out.println(llistobj);
		Object l1 = llistobj.clone();// It returns the copy of the list.
		System.out.println(l1);
		// poll or pollFirst...It returns and removes the first item of the list.
		System.out.println(llistobj.pollFirst());
		/*
		 * when the queue is empty: the remove() method throws an exception, while the
		 * poll() method returns null.
		 */
		System.out.println(".....................");
		LinkedList<String> l2 = new LinkedList<String>();
		l2.add("Sanvi");
		l2.add("hanvi");
		l2.add("Sanvi");
		l2.add("Sanvi");
		l2.add("hanvi");
		l2.add("kavitha");
		//System.out.println(l2);
	//	System.out.println(l2.pollFirst());
		System.out.println(l2);
		System.out.println(l2.removeFirstOccurrence("Sanvi"));
		System.out.println(l2);
	}

}
