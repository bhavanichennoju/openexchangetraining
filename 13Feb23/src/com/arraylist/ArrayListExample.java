package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("bhavani");// 0
		list.add("ramya");// 1
		list.add("hanvi");
		list.add("pinky");
		list.add("pinky");
		list.add("tinku");
		list.add("vikram");
		System.out.println(list);
		list.add("akash");
		System.out.println(list);// [bhavani, ramya, hanvi, pinky, tinku, vikram, akash]
		// Change an element in ArrayList
		list.set(1, "Ramya");
		System.out.println(list);// [bhavani, Ramya, hanvi, pinky, tinku, vikram, akash]
		// remove element from Arraylist in Java
		// list.remove(1);
		list.remove("pinky");
		System.out.println(list);
		// Iterating ArrayList
		for (String name : list) {
			System.out.println(name);
		}
		System.out.println(list.size());
		// sort an ArrayList
		Collections.sort(list);
		System.out.println(list);
		System.out.println(list.indexOf("Pinky"));
		String str = list.get(4);
		System.out.println(str);
		// It returns the object of list which is present at the specified index.
		// It checks whether the given object o is present in the array list
		boolean b = list.contains("madhuri");
		System.out.println(b);
		list.clear();
		System.out.println(list.size());
		ArrayList<String> arraylist = new ArrayList<String>();
		LinkedList<String> llistobj = new LinkedList<String>();
		llistobj.add("data1");
		llistobj.add("data2");
		System.out.println(llistobj.get(0));
		//arraylist.addAll(llistobj);
		System.out.println(arraylist);
	}

}
