package iteratotType;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Example2 {

	  public static void main(String[] args) {
	        // Creating an ArrayList
	        List<String> names = new ArrayList<>();
	        names.add("bhavani");
	        names.add("ramya");
	        names.add("pinky");
	        System.out.println("ArrayList: " + names);

	        // Creating an instance of ListIterator
	        ListIterator<String> iterate = names.listIterator();

	        // Using the next() method
	        String name1 = iterate.next();
	        System.out.println("Next Element: " + name1);

	        // Using the nextIndex() ,returns the index of the element that the next() method will return
	        int index1 = iterate.nextIndex();
	        System.out.println("Position of Next Element: " + index1);

	        // Using the hasNext() method
	        System.out.println("Is there any next element? " + iterate.hasNext());
	    }
 
}
