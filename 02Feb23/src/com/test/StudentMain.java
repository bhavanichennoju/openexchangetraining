package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentMain {

	public static void main(String[] args) {
		List<Student> students = Arrays.asList(
				new Student("JAVA", "AAA", "Bhongir", 19),
				new Student("C++", "VVV", "Gutta", 21),
				new Student("C++", "DDD", "Aler", 20),
				new Student("JAVA", "AAA", "Gutta", 20), 
				new Student("JAVA", "SSS", "Aler", 20));
		// group by age
//		Map<Integer, List<Student>> studentsByAge = students.stream().
//				collect(Collectors.groupingBy(Student::getAge));
//		System.out.println(studentsByAge);
//		
//		Map<Integer, Long> studentsCount = students.stream().
//				collect(Collectors.groupingBy(Student::getAge,Collectors.counting()));
//		System.out.println(studentsCount);
//		
//		Map<String, List<Student>> studentsByName = students.stream().
//				collect(Collectors.groupingBy(Student::getName));
//		System.out.println(studentsByName);
		Map<String,Long> ls=students.stream().collect(Collectors.groupingBy(a->a.getName(),Collectors.counting()));
           System.out.println(ls);
           
	}
	
}
