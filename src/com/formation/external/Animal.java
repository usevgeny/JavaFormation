package com.formation.external;

public class Animal implements Info{

	
	private String nickname;
	private String animalClass;
	private int age;
	


public Animal(String nickname, String animalClass, int age) {
		
		this.nickname = nickname;
		this.animalClass = animalClass;
		this.age = age;
	}

public String getName() {
	return nickname;
}

public int getAge() {
	return age;
}

public void sleep() {
	
	System.out.println("An Animal as I Am anly sleeps this way... Lake an animal )");
}

@Override
public void showInfo() {
	// TODO Auto-generated method stub
	System.out.println("Nick is" +this.nickname);
	
}



	
	
}
