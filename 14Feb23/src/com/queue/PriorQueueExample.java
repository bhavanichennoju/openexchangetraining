package com.queue;

import java.util.PriorityQueue;
import java.util.Queue;

import data.Student;

public class PriorQueueExample {

	public static void main(String[] args) {
		Queue<Student> students=new PriorityQueue<Student>();  
		Queue<Student> students1=new PriorityQueue<Student>();  
		Student s1=new Student(1,"bhavani",78);
		Student s2=new Student(2,"pavani",98);
		Student s3=new Student(3,"nita",48);
		Student s4=new Student(1,"Sharadha",58);
		students.add(s1);students.add(s2);students.add(s3);students.add(s4);
		/*
		 *  Adding Students data  to the queue  
		 */
 
		  for(Student s:students){  
			    System.out.print(s.getName()+"  "  );  
			    }  
		  /*
		   * Returns the head of the queue. Returns null if the queue is empty.
		   */
		  System.out.println(".......................");
		 System.out.println(students.peek());
		 System.out.println(students1.peek());
		 /*
		  * Returns and removes the head of the queue. 
		  */
		students.remove(s1);
		System.out.println(students);
		/*
		 * Returns and removes the head of the queue.
		 */
		students.poll();
		System.out.println(students);
	}

}
