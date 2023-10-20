package tpheritage;

class Vendeur extends Salarie {
	private double vente;
	private double pourcentage;
	Vendeur(int mat,String n,double r,double vente,double pourcentage){
		super( mat, n,r);
		this.vente=vente;
		this.pourcentage=pourcentage;
		
	}
	void setVente(double v) {
		this.vente=v;
	}
	void setPour(double p) {
		this.pourcentage=p;
	}
	double getVente() {
		return this.vente;
	}
	double getPour() {
		return this.pourcentage;
	}
	
	@Override()
	public void affiche() {
		super.affiche();
		System.out.println(this.getClass().getSimpleName()+ ", vente : "+vente+", pourcentage\n"+pourcentage);
	}
	@Override()
	public double salaire() {
		
		return super.salaire()+(this.vente*this.pourcentage);
	}
}
