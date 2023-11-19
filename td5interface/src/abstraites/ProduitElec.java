package abstraites;

class ProduitElec extends Article implements Promotion{
	private String categorie;
	public ProduitElec(int ref, String lib, double prixHT, int qte) {
		super(ref, lib, prixHT, qte);
		// TODO Auto-generated constructor stub
	}
	@Override
	void decrire() {
		super.decrire();
		
		System.out.println("\n la classe : "+this.getClass().getSimpleName()+"\n la categorie :  "+this.categorie);
		
	}
	
	@Override
	double calculPrixTTC() {
		return super.getPrixHT()*(1.08+this.getTva());
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	@Override
	public double prixDeVente(String dateStr) {
		if(estPeriodePromo(dateStr)) {
			return super.getPrixHT()*0.2;
		}
		else {
			return super.getPrixHT();
		}
		
	}

	

}
