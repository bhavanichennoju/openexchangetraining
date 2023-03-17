package com.testexample;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Please enter a String with duplicate characters");
		String input = scnr.nextLine();
		Set<Character> chars = new HashSet<>();
		StringBuilder output = new StringBuilder(input.length());
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (chars.add(ch)) {
				output.append(ch);
			}
		}
		System.out.println(output);
	}

}
