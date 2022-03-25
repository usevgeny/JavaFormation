package ComparaisonHerve;

public class Compte implements Comparable<Compte>{
private int solde;



public Compte(int solde) {
this.solde = solde;
}

public Compte() {
this(0);
}



public int getSolde() {
return solde;
}

public void depotDe(int montant) {
this.solde += montant;
// this.solde = this.solde + montant;
}

public void retraitDe(int montant) {
solde -= montant;
}



@Override
public String toString() {
	return "Compte [solde=" + solde + "]";
}

@Override
public int compareTo(Compte o) {
	// TODO Auto-generated method stub
	/*
	if(solde< o.solde)
		return -1;
	
	if(solde == o.solde)
		return 0;
	return 1;
	
	*/
	
	return solde - o.solde;
	
	
}



}




