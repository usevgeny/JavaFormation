package streamDemos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsYoutube {
	
	public static void main(String[] args) {
		
		List<Person> people = new ArrayList<>();
		people.add(new Person("Evgeny", 354));
		people.add(new Person("Matisse", 4));
		people.add(new Person("Elizaveta", 304));
		
		
		// method one 
		List<Person> hundredClub = new ArrayList<>();

		for (Person p:people) {

			if(p.billions>=100){
				hundredClub.add(p);}		
			}
		
		hundredClub.forEach(person -> System.out.println(person.name));
		
		
		 // method 2  streams
		
		List<Person> hundredClub2 = new ArrayList<>();
		
		hundredClub2 = people.stream()
						.filter(person -> person.billions >=100)
						.collect(Collectors.toList());
		
		
		System.out.println("STREAM IS USED FOR THE NEXT OUTPUT");
		hundredClub2.forEach(person -> System.out.println(person.name));
		
		
		
		// to sort al the names alphabeticly
		
		List<Person> sortedlist = people.stream()
												.sorted(Comparator.comparing(person -> person.name))
												.collect(Collectors.toList());
		
		
		
		System.out.println("SORTED OUTPUT");
		
		sortedlist.forEach(person -> System.out.println(person.name));
		
		
		
		// AND!! WE CAN CHAIN OUR STREAM METHODS
		
		List<Person> hunderedSortedClub = people.stream()
							.filter(person -> person.billions >= 100)
							.sorted(Comparator.comparing(person -> person.name))
							.collect(Collectors.toList());
		
		
		
		System.out.println("FILTERED AND SORTED OUTPUT");
		
		hunderedSortedClub.forEach(person -> System.out.println(person.name));
	}

	
		
	
	
	
	static class Person{
		
		String name; 
		int billions; 
		
		
		public Person(String name, int billions) {
			this.name = name;
			this.billions = billions; 
		}
		
	}
}
