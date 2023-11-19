package abstraites;

class Vetement extends ProduitGC implements Promotion{
	private String couleur;
	private String taille;
	public Vetement(int ref, String lib, double prixHT, int qte) {
		super(ref, lib, prixHT, qte);
		
	}
	public String getTaille() {
		return taille;
	}
	public void setTaille(String taille) {
		this.taille = taille;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	@Override()
	void decrire(){
		super.decrire();
		System.out.println("\n couleur : "+this.couleur+"\n taille : "+this.taille);
	}
	@Override
	public double prixDeVente(String dateStr) {
		if(estPeriodePromo(dateStr)) {
			return super.getPrixHT()*0.3;
		}
		else {
			return super.getPrixHT();
		}
		
	}
	


}
