package com.test1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ExampleOfConsumerForStudent {
	public static void main(String[] args) {
		Student s1 = new Student(1, "MCA", "AAAA");
		Student s2 = new Student(2, "MSC", "BBBB");
		Student s3 = new Student(3, "MTech", "CCCC");
		Student s4 = new Student(4, "MBA", "DDDD");

//        Consumer<Student> co=(object)->{
//        	System.out.println(object.getClassName());
//        	System.out.println(object.getName()); 
//        	System.out.println("......................");
//        };
//        co.accept(s1);
//        co.accept(s2);
//        co.accept(s3);
//        co.accept(s4);

		// consumer with foreach
		// forEach accepts the object of Consumer.

		List<Student> students = new ArrayList<Student>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		Consumer<Student> co1 = (object) -> {
			System.out.println(object.getName());
			System.out.println("......................");
		};
		students.stream().forEach(co1);
		students.stream().forEach(x -> System.out.println(x.getName()));

		/*
		 * Predicate ....student rollno 2 is there or not
		 */

		Predicate<Student> p1 = (t) -> t.getRollNo() == 2;
		System.out.println(p1.test(s4));// false
		System.out.println(p1.test(s2));// true

		/*
		 * for collection predicate(The filter method of Stream takes Predicate as an
		 * argument.)
		 */
		List<Student> slist = students.stream().filter(x -> x.getRollNo() >= 3).collect(Collectors.toList());
		System.out.println(slist);

		/*
		 * Supplier( This interface is only used to get/supply the data to another
		 * function.)
		 */
		Supplier<Student> supplier = () -> new Student(5, "MCA", "Ram");
		System.out.println(supplier.get().getName());

		/*
		 * function
		 */
		List<String> list = students.stream().map(x -> x.getName().toUpperCase()).collect(Collectors.toList());

		System.out.println(list);
	}
}