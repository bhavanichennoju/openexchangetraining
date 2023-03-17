package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample1 {

			  public static void main(String args[]){
			    ArrayList<String> names = new ArrayList<String>();
			    names.add("bhavani");
			    names.add("sowmya");
			    names.add("princy");
			 
			    Iterator<String> it = names.iterator();		 
			    while(it.hasNext()) {//returns true if iterator have more elements.
			      String obj = it.next();//returns the next element and also moves cursor pointer to the next element
			      System.out.println(obj);
			    }
			    //
			    System.out.println("....................");
			    for(String s:names) {
			    	System.out.println(s);
			    }
			 
}
}
