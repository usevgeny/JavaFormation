package ComparaisonHerve;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class TestListeOrdonnee3{
	
	
	
	public static void main(String[] args) {
		List<Compte> liste = new ArrayList<Compte>();
		
		liste.add(new Compte(40));
		liste.add(new Compte(70));
		liste.add(new Compte(20));
		
		Comparator<Compte> comparator = new Comparator<Compte>() {
			public int compare(Compte o1, Compte o2) {
				return o2.getSolde()-o1.getSolde();
			}
		};
		
		
		Collections.sort(liste, comparator);
		
		for (Compte C: liste) {
			
			System.out.println(C);
		}
	}

	
	

}
