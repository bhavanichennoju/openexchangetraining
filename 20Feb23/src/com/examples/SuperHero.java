package com.examples;

class SuperHero  {
    private final String id;
    private final String name;
    private final int age;
    
    public SuperHero(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        
        
        
    }

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "SuperHero [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
    }
    