package com.test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PersonMain {

	public static void main(String[] args) {
		List<Person> persons = List.of
				(new Person(1, "AAA", 100d, new Department(1, "HR")),
				new Person(2, "BBB", 200d, new Department(1, "HR")),
				new Person(3, "CCC", 900d, new Department(2, "Finance")),
				new Person(4, "DDD", 200d, new Department(2, "Finance")),
				new Person(5, "EEE", 200d, new Department(2, "Finance")),
				new Person(6, "FFF", 800d, new Department(3, "ADMIN")),
				new Person(7, "GGG", 900d, new Department(3, "ADMIN")));

		Map<Department, Long> map = persons.stream().collect(Collectors.groupingBy(Person::getDepartment,Collectors.counting()));
		System.out.println(map);

	
	}
}
