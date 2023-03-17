import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ReverseCollections {

	public static void main(String[] args) {
		List<String> listOfNames = new ArrayList<String>(4);
		List<String> listOfNamesCopy = new ArrayList<String>(4);
		listOfNames.add("AAA");
		listOfNames.add("BBB");
		listOfNames.add("KKK");
		listOfNames.add("JJJ");
		listOfNamesCopy.add("AAA1");
		listOfNamesCopy.add("BBB1");
		listOfNamesCopy.add("KKK1");
		listOfNamesCopy.add("JJJ1");

		// Collections.reverse(listOfNames);
		// System.out.println(listOfNames);
		// boolean b=Collections.addAll(listOfNames,"RRR");// addAll() method returns
		// true if the collection changed as a result of the method call
		// System.out.println(b);
		// int f=Collections.binarySearch(listOfNames,"AAA",Collections.reverseOrder());
		// System.out.println(f);
		// boolean b=Collections.disjoint(listOfNames, listOfNamesCopy);//returns true
		// if the two specified collections have no elements in common.
		// System.out.println(b);
//		Collections.fill(listOfNames, "lll");
//		System.out.println(listOfNames);
//		
//		List<String> arrlist = new ArrayList<String>();
//		arrlist.add("Java");
//		arrlist.add("COBOL");
//		arrlist.add("Java");
//		arrlist.add("C++");
//		arrlist.add("Java");
//		List<String> arrlist1 = new ArrayList<String>();
//		arrlist1.add("Java");
//	//	arrlist1.add("C++");
//		arrlist1.add("Java");
//		int index=Collections.indexOfSubList(arrlist, arrlist1);
//		System.out.println(index);
//		
	//	System.out.println("List of elements: " + arrlist);
	//	System.out.println("Frequency of the Word: " + Collections.frequency(arrlist, "Java"));

		
	//	Collections.sort(listOfNames);//ascending order
//		Collections.reverse(listOfNames);//ascending order
//		System.out.println(listOfNames);
	Collections.sort(listOfNames,Collections.reverseOrder());
	System.out.println(listOfNames);
		//Collections.shuffle(listOfNamesCopy);
	//	System.out.println(listOfNamesCopy);
	
	}

}
