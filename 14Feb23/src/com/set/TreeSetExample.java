package com.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
		 public static void main(String args[]){  
			 TreeSet<String> set=new TreeSet<String>();  
			         set.add("bhavani");  
			         set.add("Vijaya");  
			         set.add("akash");  
			         System.out.println("Descending order");  
			         Iterator i=set.descendingIterator();  
			         while(i.hasNext())  
			         {  
			             System.out.println(i.next()); 
			   
			         }  
			         //
			         System.out.println(set.pollFirst());    
			           
			 }  

}
