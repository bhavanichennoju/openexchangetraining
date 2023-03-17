package iteratotType;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorClassExample1 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++)
			al.add(i);

		System.out.println(al);

		Iterator<Integer> itr = al.iterator();

		// Checking the next element where
		// condition holds true till there is single element
		// in the List using hasnext() method
		while (itr.hasNext()) {
			// Moving cursor to next element
			int i = itr.next();

			// Getting elements one by one
			System.out.print(i + " ");

			// Removing odd elements 
			if (i % 2 != 0)
				itr.remove();
		}

		System.out.println(); // Printing the elements inside the object
		System.out.println(al);
	}
}
