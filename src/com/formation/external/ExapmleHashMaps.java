package com.formation.external;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ExapmleHashMaps {

	
	public static void main(String[] args) {
		
		List<String> joueurs = new ArrayList<>();
		
		joueurs.add("Joueur1");
		joueurs.add("Joueur2");
		joueurs.add("Joueur3");
		joueurs.add("Joueur4");
		
		
		
		System.out.println(joueurs);
		
		for(String joueur:joueurs) {
			
			System.out.println(joueur);
		}
		
		
		
		System.out.println("\n\n on continue avec les maps");
		Map<String, Integer> ages = new HashMap<>();
		
		ages.put("Graven", 18);
		ages.put("Michel", 55);
		ages.put("Bob", 27);
		
	
		
		System.out.println(ages.toString());
		
		System.out.println(ages.get("Graven"));
		
		//replace values vor a specifyed key
		ages.replace("Michel", 8);
		
		System.out.println(ages.toString());
		
		//ages.remove("Michel");
		
		
		
		System.out.println(ages.toString());
		
		
		double averageAge = 0;
		
		
		
		if(ages.containsKey("Nicolas")) { // ages.containsValue(si elle content les values) 
			
			System.out.println("La clef exists bien");
		}
		
		else {
			System.out.println("La clef n'existe pas");
		}
		
		
		
		for(Entry<String,Integer> element :ages.entrySet()){ // ages.keySet dans el cas on veut pritout les keys
			
			//System.out.println(element);
			System.out.println("la clef est: "+element.getKey()+", la valeur"+element.getValue());
			averageAge+=element.getValue();
		}
		
		averageAge = (averageAge/ages.size());
		
		//ages.clear();
		System.out.println(ages);
		System.out.println("Average age: "+averageAge);
		System.out.println("A Hashcode: "+ages.hashCode());
		
		String hasExemple = "Just a string";
		System.out.println("haschcode of a string"+hasExemple.hashCode());
		//System.out.println("Hashcode Graven: "+ages.get("Graven").hashCode());
		
		
		
	}
	
	
}
