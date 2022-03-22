package com.formation.external;

public class TestInterfaces {
public static void main(String[] args) {
	
	Animal animal1 = new Animal("Kookie", "cat", 3);
	Person person1 = new Person("Name", 27);
	
	
	// calling for interfaces methods:
	
	animal1.showInfo();
	person1.showInfo();
	
	// calling for interfaces
	System.out.println("\n\n calling for methods throught interfaces instanciation \n\n ********** \n");
	Info in1 = new Animal("Kookie", "cat", 3);
	Info in2 = new Person("Name", 27);
	
	in1.showInfo();
	in2.showInfo();
	// calling through another method,
	System.out.println("\n\n calling for methods throught a dedicated method \n\n ********** \n");
	outputInfo(in2);
	outputInfo(in1);
	
	
	// and even this way will work, because despite the fact that outputInfo takes info objects as arguments it will still work if we put there objects that implement that methods
	System.out.println("\n\n calling for methods throught a dedicated method but through OBJECTS IMPLEMENTING THAT INTERFACE \n\n ********** \n");
	outputInfo(animal1);
	outputInfo(person1);
	
}

// yet another way to call for interface methods
public static void outputInfo(Info info) {
	
	info.showInfo();
	
	
}


}
