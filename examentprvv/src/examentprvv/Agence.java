package examentprvv;

public class Agence {

	Voiture[] lesvoitures;
	private String ref;
	private int taille;
	int nbrvoitures;
	public Voiture[] getLesvoitures() {
		return lesvoitures;
	}
	public void setLesvoitures(Voiture[] lesvoitures) {
		this.lesvoitures = lesvoitures;
	}
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public int getTaille() {
		return taille;
	}
	public void setTaille(int taille) {
		this.taille = taille;
	}
	public int getNbrvoitures() {
		return nbrvoitures;
	}
	public void setNbrvoitures(int nbrvoitures) {
		this.nbrvoitures = nbrvoitures;
	}
	public Agence(int i, String ref) {
		this.taille=i;
		this.ref=ref;
		this.lesvoitures=new Voiture[i];
	}
	void selectionne(Critere c) {
			for(int i=0;i<nbrvoitures;i++) {
				if(c.correspond(lesvoitures[i])) {
					System.out.println(lesvoitures[i].toString());
				}
			}
	}
	void ajout(Voiture v) throws AjoutInterditException{
		if(this.taille>this.nbrvoitures)
		{
			if(2016-v.getAnne()<=5) {
			
			lesvoitures[nbrvoitures]=v;
			nbrvoitures++;
		}
		else {
			throw new AjoutInterditException("age sup a 5 ans");
		}
	}
		else System.out.println("pas d'espace!!!");
	}

}
