package com.test4;

import java.util.HashMap;import java.util.Map;

public class MapInterfaceExample {

	public static void main(String[] args) {
		HashMap<Integer,String> mp=new HashMap<Integer,String>();
		mp.put(1, "Student5");
		mp.put(2, "Student2");
		mp.put(3, "Student3");
		mp.put(4, "Student4");
		for(Map.Entry m:mp.entrySet()) {
			System.out.println(" key  "+m.getKey() +" ..."+"value  "+m.getValue());
		}
		
		mp.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);  
	 System.out.println("..........................................");
		mp.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
	}

}
