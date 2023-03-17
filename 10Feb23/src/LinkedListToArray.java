
import java.util.Arrays;
import java.util.LinkedList;
public class LinkedListToArray 
{
	public static void main(String args[]){ 
		LinkedList<String> listOfBooks = new LinkedList<>(); 
		listOfBooks.add(" Java"); 
		listOfBooks.add("C++"); 
		listOfBooks.add("Python");
		System.out.println("LinkedList: " + listOfBooks);
		String[] arrayOfBooks = listOfBooks.toArray(new String[listOfBooks.size()]);
		System.out.println("String array: " + Arrays.toString(arrayOfBooks)); 
	System.out.println("............................................");
		LinkedList<Integer> listOfScores = new LinkedList<>(); 
		listOfScores.add(100); 
		listOfScores.add(171); 
		listOfScores.add(264); 
		System.out.println("LinkedList: " + listOfScores);
		Integer[] scores = listOfScores.toArray(new Integer[listOfScores.size()]);
		System.out.println("Integer array: " + Arrays.toString(scores));
	}
}