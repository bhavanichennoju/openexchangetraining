package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//public class DemoExample {
//    public static void main(String[] args) {
//        String array[] = {"a", "b", "c"};
//        List<String> list = Arrays.asList(array);
//        list.add("d");
//    }
//}
public class DemoExample {
    public static void main(String[] args) {
        String array[] = {"a", "b", "c"};
        List<String> list = Arrays.asList(array);

        List<String> arraylist = new ArrayList<>(list);

        arraylist.add("d");

        System.out.println(arraylist);
    }
}