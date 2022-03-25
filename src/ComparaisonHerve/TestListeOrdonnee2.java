package ComparaisonHerve;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class TestListeOrdonnee2 implements Comparator<Compte>{
	
	
	
	public static void main(String[] args) {
		List<Compte> liste = new ArrayList<Compte>();
		
		liste.add(new Compte(40));
		liste.add(new Compte(70));
		liste.add(new Compte(20));
		
		
		Collections.sort(liste, new TestListeOrdonnee2());
		
		for (Compte C: liste) {
			
			System.out.println(C);
		}
	}

	@Override
	public int compare(Compte o1, Compte o2) {
		// TODO Auto-generated method stub
		return o2.getSolde() - o1.getSolde();
	}
	
	

}
