package extraTasks.FindCelebrity;
/**
 * Find a celebrity in a group
 * a selebrity is a person that everybodyy in the group knows, 
 * on the contrary this celebrity doesnt know any of the persons of the group
 * @author evgeny
 * https://www.youtube.com/watch?v=xGvQN_g-JCI 
 *
 */
public class FindCelebrity {
	
	
	public static void main(String[] args) {
		
		
		Person Vasya = new Person("Vasya");
		Person Dima = new Person("Dima");  //Celebrity, knows nobody, but everybody knows him
		Person Petya = new Person("Petya");
		Person Vlad = new Person("Vlad");
		Person Maksim = new Person("Maksim");
		
		Vasya.addFriend(Maksim);
		Vasya.addFriend(Dima);
		Vasya.addFriend(Vlad);
		
		Petya.addFriend(Maksim);
		Petya.addFriend(Dima);
		Petya.addFriend(Vlad);
		
		Vlad.addFriend(Vasya);
		Vlad.addFriend(Dima);
		Vlad.addFriend(Vlad);
		
		Maksim.addFriend(Petya);
		Maksim.addFriend(Dima);
		Maksim.addFriend(Vlad);
		
		
		System.out.println(Dima.getAcquaintances());
		
		
		Person[] groupWithCelebrity = new Person[] {Vasya,Dima,Petya,Vlad,Maksim};
		
		int l=0,r=groupWithCelebrity.length-1;
	
		System.out.println(findCeleb(groupWithCelebrity));
		
	}
	
	public static Person findCeleb(Person[] persons) {
		
		int l=0,r=persons.length-1;
		while(l!=r) {
			if (persons[l].knows(persons[r])){
				l++;
			}else {
				r--;
			}
		}
	
		for (int i =0; i<persons.length;i++) {
				
				if (i != l
						&&(!persons[i].
								knows(persons[l])
								||persons[l].
								knows(persons[i])
						  )
					){	return null;}
				
			}
			
		
		return persons[l];
		
	}
	
	
}

