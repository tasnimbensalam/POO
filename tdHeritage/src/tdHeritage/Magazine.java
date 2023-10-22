package tdHeritage;

class Magazine extends Livre{
	private int mois;
	Magazine(int id,String nom,int nbrp,String domaine,int mois){
		super(id, nom, nbrp, domaine);
		this.mois=mois;
	}
	@Override()	
	public String toString()
	{
		
			return super.toString()+"\nle mois est\n"+mois;
	}
	
	double calculePrix(int bonus) {
		return (0.35*super.nbrp)*(1+super.tva)+bonus;
	}
	
	
}
