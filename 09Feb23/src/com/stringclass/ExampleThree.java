package com.stringclass;

import java.util.Arrays;

//Methods of Java String
public class ExampleThree {

	public static void main(String[] args) {
		  String str1 = "Java String contains()";
		    boolean result = str1.contains("Java");//checks whether the string contains a substring
		    System.out.println(result);
		    System.out.println(str1.substring(5,12));//extracts a substring from the string and returns it.
		    String str2 = "Hi";
		    String str3 = "Good";
		    String str4 = "Morming";

		    // join strings with space between them
		    String joinedStr = String.join(" ",str2, str3, str4);

		    System.out.println(joinedStr);
		    System.out.println(str1.replace("Java", "C++"));
		    
		    
		    byte[] bytes=str3.getBytes();
		    System.out.println(bytes);
		    System.out.println(Arrays.toString(bytes));
		    String d1 = String.format("%d", 101); 
		    System.out.printf("%d",101);
		    System.out.println("lll");
		    System.out.println(d1);
		   
	}

}
