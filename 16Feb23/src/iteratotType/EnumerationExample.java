package iteratotType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class EnumerationExample {
	   public static void main(String args[]) {
		   Vector subjects = new Vector();
		   
	        subjects.addElement("Java");
	        subjects.addElement("Servlet");  
	        subjects.addElement("JSP");  
	        subjects.addElement("Spring");
	        subjects.addElement("Hibernet");
	 
	        // Get Enumeration
	        Enumeration enumeration = subjects.elements();
	 
	        // Print Vector elements
	        while (enumeration.hasMoreElements()){
	            System.out.println(enumeration.nextElement()); 
	        }
	 
	    } 
	   }