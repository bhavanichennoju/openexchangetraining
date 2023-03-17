package com.demo;

class Animal {

	  public void eat() {
	    System.out.println("eat");
	  }
	}

	class Dog extends Animal {

	  @Override
	  public void eat() {
	    System.out.println("eating");
	  }

	  public void ate() {
	    System.out.println("ate");
	  }
	}

	public class Main {
	  public static void main(String[] args) {

	    Dog d = new Dog();

	    d.eat();
	    d.ate();;
	  }
	}