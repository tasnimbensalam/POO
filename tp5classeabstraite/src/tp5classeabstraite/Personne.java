package tp5classeabstraite;

class Personne {
	private int cin;
	private String nom;
	private String prenom;
	Personne(int cin,String nom,String prenom){
		this.cin=cin;
		this.nom=nom;
		this.prenom=prenom;
		
	}
	public String getNom() {
		return this.nom;
	}
	public String getPrenom() {
		return this.prenom;
	}
	public int getCin() {
		return this.cin;
	}
	void setNom(String nom) {
		this.nom=nom;
	}
	void setprenom(String prenom) {
		this.prenom=prenom;
	}
	void setNom(int cin) {
		this.cin=cin;
	}
	public String toString() {
		return"le cin : "+this.cin+"\n le nom : "+this.nom+"\n le prenom : "+this.prenom;
	}
}
