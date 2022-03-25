package ComparaisonHerve;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class TestListeOrdonnee1 {
	
	
	
	public static void main(String[] args) {
		List<Compte> liste = new ArrayList<Compte>();
		
		liste.add(new Compte(40));
		liste.add(new Compte(70));
		liste.add(new Compte(20));
		
		
		Collections.sort(liste);
		
		for (Compte C: liste) {
			
			System.out.println(C);
		}
	}

}
