package com.formation.external;

public class Person implements Info {
	
	
		private String name;
		private int age;
		
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
		
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public void sleep() {
		
		System.out.println("Im sleeping as a humain");
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("Name is"+this.name);
	}

	
	
}
