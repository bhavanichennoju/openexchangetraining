package com.testexample;

public class example {
	public static String removeCharAt(String s, int pos) {
	      return s.substring(0, pos) + s.substring(pos + 1);
	   }
	 public static void main(String[] args) {
	        String s1 = "India is great ";
	        s1 = s1.toLowerCase();
	        String s2="in";
	        
	        for (int i = 0; i < s1.length(); i++) {
	            for (int j = 0; j < s2.length(); j++) {
	                if(s2.charAt(j) == s1.charAt(i)) {
	                    s1 = removeCharAt(s1, i);
	            }
	        }               
	    }
	        System.out.println(s1);
	        
	}
}
