
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamCollectorsExample1 {
	public static void main(String args[]) {
	List<Integer> values=new ArrayList<Integer>();
	for(int i=1;i<10;i++) {
		values.add(i);
	}
	List<Integer> k=values.stream().filter(i->i%2==0).collect(Collectors.toList());
	System.out.println(k);
	
	List<String> names=new ArrayList<String>();
	names.add("bhavani");
	names.add("chennoju");
	names.add("vikram");
	names.add("shivakoti");
	names.add("ramesh");
	names.add("shivakoti");
	System.out.println(names);//arrayList..duplicates are allowed,insertion order will be
	
	
	//Intermediate methods
	
//	
//    //stream.filter()
//	long c=names.stream().filter((s)->s.startsWith("s")).count();
//	System.out.println(c);
//	
//	//calling another stream operation like for Each
//	names.stream().filter((s)->s.startsWith("s")).forEach(System.out::println);
//	
//	// Stream.map()---converting each element in the stream to another
//	names.stream().map(String::toUpperCase).forEach(System.out::println);

	names.stream().filter((s)->s.startsWith("s")).map(String::toUpperCase).forEach(System.out::print);
	System.out.println();
	
//	//stream.sorted
//	System.out.println("stream.sorted() are");
//	names.stream().sorted().forEach(System.out::println);
//	
//	System.out.println("stream.distinct() are");
//	names.stream().distinct().sorted().forEach(System.out::println);
//	
//	//stream.skip()
//	System.out.println("stream.skip()");//program to skip the first 2 elements and print remaining elements.
//	names.stream().skip(2).forEach(System.out::println);
	
}
	
}