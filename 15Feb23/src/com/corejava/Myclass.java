package com.corejava;

public class Myclass<T>
{
    T obj; 
     Myclass(T obj) {
           this.obj = obj; 
    }
     T getObject() {
	  return obj; 
    }
}
