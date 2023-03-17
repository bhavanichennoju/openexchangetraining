package data;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Data {

	
	public static List<Student> getAllStudents(){
		LinkedList<Student> l=new LinkedList<Student>();
		l.add(new Student(1,"bhavani",78));
		l.add(new Student(2,"pavani",98));
		l.add(new Student(3,"nita",48));
		l.add(new Student(1,"Sharadha",58));
		return l;
	}
}
