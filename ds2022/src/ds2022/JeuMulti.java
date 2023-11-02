package ds2022;

class JeuMulti extends Jeu {
private int nbrjoueur;
JeuMulti(String nom, int annee, int ageMin, Editeur edit,int nbrjoueur){
	super (nom,  annee, ageMin, edit);
	this.nbrjoueur=nbrjoueur;
}
public int getNbrj() {
	return this.nbrjoueur;
}
@Override()
void decrire() {
	System.out.println("\n");
	super.decrire();
	System.out.println("le nbr de joueur es "+this.nbrjoueur+"]");
}

}
