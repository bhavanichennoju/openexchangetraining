package com.test;
//java doesn't support multiple inheritance. 
//However, we can achieve multiple inheritance using interfaces.
interface AnimalEat {
	   void eat();//here declare the methods
	}
interface AnimalTravel {
	   void travel();
	}
class Animal implements AnimalEat, AnimalTravel {
	   public void eat() {
	      System.out.println("Animal is eating");//here we r define the methods
	   }
	   public void travel() {
	      System.out.println("Animal is travelling");
	   }
	}
public class MutlipleInheritance {
	   public static void main(String args[]) {
	      Animal a = new Animal();
	      a.eat();
	      a.travel();
	   }
	}



