package iteratotType;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] args) {
		 ArrayList subjects = new ArrayList();
		 
	        // Adding elements to ArrayList
	        subjects.add("Java");
	        subjects.add("C++");
	        subjects.add("MYSQL");
	 
	        // Get ListIterator
	        ListIterator listIterator = subjects.listIterator();
	 
	        // Print ArrayList elements in Forward Direction
	        System.out.println("ArrayList elements in Forward Direction"); 
	        while (listIterator.hasNext()){
	            System.out.println(listIterator.next()); 
	        }
	 
	        // Print ArrayList elements in Backward Direction
	        System.out.println("ArrayList elements in Backward Direction"); 
	        while (listIterator.hasPrevious()){
	            System.out.println(listIterator.previous()); 
	        }
	    } 

}
