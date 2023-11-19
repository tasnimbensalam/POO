package abstraites;

class ProduitGC extends Article{
	public ProduitGC(int ref, String lib, double prixHT, int qte) {
		super(ref, lib, prixHT, qte);
		
	}
	@Override
	double calculPrixTTC() {
		return super.getPrixHT()*(1+super.getTva());
		
	}
	void decrire(){
		super.decrire();
		System.out.println("\n La classe : "+this.getClass().getSimpleName());
	}

	
}
