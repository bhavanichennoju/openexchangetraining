package com.examples;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainProgram {
    public static void main(String[] args) {
    	String phoneNumber = "59999999";
    	String regex = "[7-9][0-9]{9}";

    	System.out.println("The phone number is: " + phoneNumber);
    	System.out.println("Is the above phone number valid? " + phoneNumber.matches(regex));
    	
    	
    	
//        List<SuperHero> superHeroes = new ArrayList<>();
//
//        superHeroes.add(new SuperHero("3", "Hulk", 20));
//        superHeroes.add(new SuperHero("4", "Captain America", 25));
//        superHeroes.add(new SuperHero("1", "Captain America", 28));
//        
//        superHeroes.sort(
//            Comparator.comparing(SuperHero::getName)
//               .thenComparing(SuperHero::getAge, Comparator.reverseOrder())
//        );
//        
//        System.out.println("Ordered by Name asc and Age desc");
//        superHeroes.forEach(superHero -> 
//                            System.out.println(superHero.toString()));
    }
}