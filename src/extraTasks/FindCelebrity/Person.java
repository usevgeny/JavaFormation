package extraTasks.FindCelebrity;

import java.util.ArrayList;
import java.util.List;

public class Person implements Aware {
	
	String name;
	List<Person> acquaintances = new ArrayList<>();
	
	{
		this.name = "Anonimous";
	}
	
	public Person(String name) {
		
		this.name = name;
		this.acquaintances = new ArrayList<>();
	}
	
	public Person() {
	
	}

	public void addFriend(Person newFriend) {
		this.acquaintances.add(newFriend);
		
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Person> getAcquaintances() {
		return acquaintances;
	}

	public void setAcquaintances(List<Person> acquaintances) {
		this.acquaintances = acquaintances;
	}

	@Override
	public boolean knows(Person kandidate) {
		if (acquaintances.contains(kandidate)) {
			return true;
		}
	
		return false;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
	
	
	

}
