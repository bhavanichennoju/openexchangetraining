package com.test4;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private Long id;
    private String name;
    private Integer age;
    private String department;
   
    Student(Long id, String name, Integer age, String department) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
       
    }
    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Integer getAge() {
        return age;
    }
    public String getDepartment() {
        return department;
    }
  
    @Override
    public String toString() {
        //Printing only id and name for brevity
        return "id = " + id+ ","
        	+ " name = " + name +","
    + " age = " + age+ ","+"department="+department;
}
}
