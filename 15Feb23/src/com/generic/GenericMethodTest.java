package com.generic;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class GenericMethodTest {
	// generic method printArray
	public static <E> void printArray(E[] inputArray) {
		// Display array elements
		for (E element : inputArray) {
			System.out.printf("%s ", element);
		}
		System.out.println();
	}

	public static <T> List<T> fromArrayToList(T[] a) {
		return Arrays.stream(a).collect(Collectors.toList());
	}

	public static <T> List<T> withList(List<T> list) {
	    return list.stream().sorted().collect(Collectors.toList());
	}
	
	static <T> void withPrintMethod(List<T> list) {
	     list.stream().forEach(System.out::println);
	}
	public static void main(String args[]) {
		// Create arrays of Integer, Double and Character
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

		System.out.println("Array integerArray contains:");
		printArray(intArray); // pass an Integer array

		System.out.println("\nArray doubleArray contains:");
		printArray(doubleArray); // pass a Double array

		System.out.println("\nArray characterArray contains:");
		printArray(charArray); // pass a Character array
		System.out.println(fromArrayToList(intArray));
		System.out.println(fromArrayToList(doubleArray));

		List<Student> l = Data.getAllStudents();
		List<Student> lists = l.stream().sorted().collect(Collectors.toList());
		System.out.println(lists);
		//create generic method
		System.out.println(withList(lists));
		
		withPrintMethod(lists);


	}
}
