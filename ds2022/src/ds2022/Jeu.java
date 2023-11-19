package ds2022;

class Jeu {
	 private static int count ; 
	private int id;
	private String nom;
	private int an;
	
	private int agemin;
	private Editeur editeur;
	Jeu(Editeur e){
		this.id=++count;
		this.editeur=e;
		
		
	}
	Jeu(String nom, int annee, int ageMin, Editeur edit){
		this(edit);
		this.nom=nom;
		this.an=annee;
		this.agemin=ageMin;
	}
	public Editeur getEditeru() {
		return this.editeur;
	}
	void setEditeur(Editeur e) {
		this.editeur=e;
	}
	void decrire() {
		System.out.println("[Jeu id = "+this.id+" Annee d'edition = "+this.an+"Age minimum = "+this.agemin+ "Editeur "+this.getEditeru()+"]");
	}
	
}
