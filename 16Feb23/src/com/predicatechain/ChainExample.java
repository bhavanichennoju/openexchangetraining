package com.predicatechain;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.Employee;

public class ChainExample {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
	              new Student(1, "Akash", 100),
	              new Student(2, "bhavani", 200),
	              new Student(3, "pinky", 300),
	              new Student(4, "dolly", 400),
	              new Student(5, "smily", 500),
	              new Student(6, "shanvi", 600)
	            );

	Predicate<Student> idLessThan2 = e -> e.getId() < 2;

	Predicate<Student> salaryGreaterThan500 = e -> e.getSalary() > 500;

	List<Student> filtered = list.stream()
	        .filter( idLessThan2.or( salaryGreaterThan500 ) )
	        .collect(Collectors.toList());

	System.out.println(filtered);

	}

}
