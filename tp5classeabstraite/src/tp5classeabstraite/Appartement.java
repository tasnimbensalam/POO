package tp5classeabstraite;

 class Appartement extends ProprietePrivee {

int numEtage;
Appartement(int id, Personne r, String a, double s, int nbpieces,int num) {
		super(id, r, a, s, nbpieces);

			this.numEtage=num;
	}

@Override()
public String toString() {
	return super.toString()+"\nle numero d'etage : "+this.numEtage;
}



}
