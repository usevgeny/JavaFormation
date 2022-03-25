package WriteReadCompareYT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparator {
	public static void main(String[] args) {
		
	
	// créer ube liste qui va stocker les jouets de notre site
	List<Toy> jouets = new ArrayList<Toy>();
	jouets.add(new Toy("ZToy", 15, "super jouet", 5));
	jouets.add(new Toy("Ejouet", 15, "un jouet normal", 10));
	jouets.add(new Toy("Bjouet", 2, "DIY jouet", 0));
	jouets.add(new Toy("Ajouet", 120, "Peluche", 5));
	jouets.add(new Toy("YJouet", 15, "DIY jouet", 80));
	
	
	// trier les élménts
	
	// 	Collections.sort((jouets)); ne fonctionnera que dans le cas des arrays
	
	//output des strings
	
	// afficher les characteristiques de chacun des jouets
	
	
	Collections.sort(jouets, new PriceComparator()); 
	
	for(Toy jouet:jouets) {
		
	System.out.println(jouet.getName()+"- Price: "+jouet.getPrice()+"euros   - Promo: "+jouet.getPromo()+"%     - Description:      "+jouet.getDescription());}
	
	}

}
