package com.examples;

enum LevelEnum {
	  LOW,
	  MEDIUM,
	  HIGH
	  
	}

public class MainExample {
	  public static void main(String[] args) {
		  LevelEnum myVar = LevelEnum.MEDIUM;
	    switch(myVar) {
	      case LOW:
	        System.out.println("Low level");
	        break;
	      case MEDIUM:
	         System.out.println("Medium level");
	        break;
	      case HIGH:
	        System.out.println("High level");
	        break;
	    }
	    for (LevelEnum list : LevelEnum.values()) {
	    	  System.out.println(list);
	    	}
	  }
	}