package com.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		 HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
		   map.put(1,"bhavani");  //Put elements in Map  
		   map.put(2,"ramya");    
		   map.put(3,"hanvi");   
		   map.put(4,"vikram");   
		   map.replace(4, "ramesh");  
		   for(Map.Entry m : map.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());    
		   }  
		}  
	
}
