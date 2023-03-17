package com.test4;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class MainMethodGrouping {

	public static void main(String[] args) {

		Student s1 = new Student(1L, "apple", 22, "MPC");
		Student s2 = new Student(2L, "banana", 23, "MPC");
		Student s3 = new Student(3L, "carrot", 23, "BIPC");
		Student s4 = new Student(4L, "tomato", 24, "MPC");
		Student s5 = new Student(5L, "apple", 22, "MPC");
		Student s6 = new Student(6L, "banana", 21, "BIPC");
		Student s7 = new Student(7L, "potato", 23, "BIPC");
		Student s8 = new Student(8L, "tomato", 24, "MPC");
		Student s9 = new Student(9L, "apple", 23, "MPC");
		Student s10 = new Student(10L, "banana", 22, "BIPC");
		List<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);
		list.add(s7);
		list.add(s8);
		list.add(s9);
		list.add(s10);
		//list.forEach(x -> System.out.println(x));
		Map<Integer, Long> result = list.stream()
				.collect(Collectors.groupingBy(Student::getAge, Collectors.counting()));
		//System.out.println(result);

		Map<String, Long> results = list.stream()
				.collect(Collectors.groupingBy(Student::getName, Collectors.counting()));
		//System.out.println(results);
		
		Map<String, List<Long>> result2 = list.stream()
				.collect(Collectors.groupingBy(Student::getDepartment,Collectors.mapping(Student::getId,Collectors.toList())));
		//System.out.println(result2);
		
		TreeMap<String, Set<Long>> departmentToStudentIdsAsTreeMap = list.stream()
		        .collect(Collectors.groupingBy(Student::getDepartment,
		                TreeMap::new,
		                Collectors.mapping(Student::getId, Collectors.toSet())));
		System.out.println(departmentToStudentIdsAsTreeMap);
	}

}
