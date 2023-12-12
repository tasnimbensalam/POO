package examentprvv;

public class Voiture {

	
	 String marque ;
	String modele ;
	int anneP;
	double prix;
	
	public Voiture(String marque, String modele, int anneP, double prix) {
		this.marque = marque;
		this.modele = modele;
		this.anneP = anneP;
		this.prix = prix;
	}
	public String getMarque(){ return marque ;}
	public String getModele() { return modele;}
	public int getAnne() { return anneP;}
	public double getPrix() { return prix;}
	@Override
	public String toString() {
		return "Voiture [marque=" + marque + ", modele=" + modele + ", anneP=" + anneP + ", prix=" + prix + "]";
	}
	

}
