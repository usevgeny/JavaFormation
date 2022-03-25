package ComparaisonHerve;

public class TestCompte {
public static void main(String[] args) {
	// TODO Auto-generated method stub

	Compte Dupont = new Compte();
	
	// la methode Compte.setSolde() ne fonctionnera pas car on ne pourra pas manipuler la variable 'solde' de l'exterieur
	
	//Dupont.setSolde();
	//System.out.println("Le Solde initial: "+Dupont.getSolde());
	
	Dupont.depotDe(5);
	System.out.println("Le Solde apr�s le d�pot:  "+Dupont.getSolde());
	
	
	Dupont.retraitDe(10);
	System.out.println("Le Solde apr�s le retrait:  "+Dupont.getSolde());
}
}
