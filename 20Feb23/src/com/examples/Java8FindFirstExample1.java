package com.examples;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Java8FindFirstExample1 {

    public static void main(String[] args) {

//        List<Integer> list = Arrays.asList(1, 2, 3, 2, 1);
//
//        Optional<Integer> first = list.stream().findFirst();
//        if (first.isPresent()) {
//            Integer result = first.get();
//            System.out.println(result);       // 1
//        } else {
//            System.out.println("no value?");
//        }
//
//        Optional<Integer> first2 = list
//                .stream()
//                .filter(x -> x > 1).findFirst();
//
//        if (first2.isPresent()) {
//            System.out.println(first2.get()); // 2
//        } else {
//            System.out.println("no value?");
//        }
//    }

        List<String> list = Arrays.asList("bhavani","ramya","bhavani","pinky");

        Optional<String> any = list.stream().filter(x ->x.length()<6).findAny();
        if (any.isPresent()) {
            String result = any.get();
            System.out.println(result);
        }
        List<Integer> i = Arrays.asList(1,2,3,4,5,6,7,8,9);
        i.stream().parallel().forEach(System.out::println);
        i.stream().forEach(System.out::println);
    }

}