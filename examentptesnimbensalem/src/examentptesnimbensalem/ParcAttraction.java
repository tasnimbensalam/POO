package examentptesnimbensalem;

public class ParcAttraction {
private Attraction[] lesAttractions;
private int nb_attraction=0;
private String nom;
private int taille;
public ParcAttraction(String nom, int taille) {
	
	this.nom = nom;
	this.taille = taille;
	this.lesAttractions=new Attraction[taille];
}
void ajouteAttraction(Attraction a) {
	if(nb_attraction<taille) {
		lesAttractions[nb_attraction]=a;
		nb_attraction++;
	}
	else {
		System.out.println("pas d'eespace");
	}
}
float getRecette() {
	float r=0;
	for(int i=0;i<nb_attraction;i++) {
		r+=lesAttractions[i].getRecette();
		}
	return r;
}
void affiche() {
	System.out.println("le nom du parc est :"+this.nom);
	for(int i=0;i<nb_attraction;i++) {
		lesAttractions[i].affiche();
		/*System.out.println("\nle nom de l'attraction : "+lesAttractions[i].getNom());
		System.out.println("\nla condition du parc : "+lesAttractions[i].getCondition().getAgemin()+" ans");
		System.out.println("\nla recette : "+lesAttractions[i].getRecette()+" dinar");*/
		
	}
}
}
