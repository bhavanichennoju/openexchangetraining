package test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDistinct {
    public static void main(String[] args) {

        Stream<Integer> stream1 = Stream.of(1,2,3);
        Stream<Integer> stream2 = Stream.of(4,2,1);
        Stream<Integer> stream3 = Stream.of(3,5,6);
        Stream<Integer> s1 = Stream.concat(Stream.concat(stream1, stream2),stream3);
        System.out.println(s1.collect(Collectors.toList()));
      //  System.out.println(s1.distinct().collect(Collectors.toList()));
        ArrayList<String>
        arrlist = new ArrayList<String>();
        arrlist.add("A");
        arrlist.add("B");
        arrlist.add("C");
        arrlist.add("D");
        arrlist.add("E");

        // print arrlist
        System.out.println("Original arrlist: "
                           + arrlist);

        // getting the subList
        // using subList() method
        List<String> arrlist2 = arrlist.subList(2, 4);

        // print the subList
        System.out.println("Sublist of arrlist: "
                           + arrlist2);
    }
    
}