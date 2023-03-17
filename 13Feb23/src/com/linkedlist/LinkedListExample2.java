package com.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample2 {

	public static void main(String[] args) {
		  List<String> list = new ArrayList<String>();
	      list.add("A");
	      list.add("C");
	      list.add("C");
	      list.add("D");
	      List<String> list1 = new LinkedList<String>();
	      list1.add("A");
	      list1.add("B");
	      list1.add("C");
	      list1.add("D");
	      System.out.println(list);
	      System.out.println(list1);
	     list.addAll(list1);
	     System.out.println(list);
	     System.out.println("...................");
	     System.out.println(list.indexOf("C"));
	     
	    
	  }

	}

