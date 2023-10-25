package JCC;

class Documentaire extends Film{
	private String sujet;
	private float tarif=2f;
	Documentaire(String titre,String r,String pays,int d,String sujet){
		super(titre, r, pays, d);
		this.sujet=sujet;
		
	}
	@Override()
	public String toString() {
		return super.toString()+"\n sujet : "+this.sujet;
	}
	@Override()
	float totalVenteBillet() {
		return super.getNBRP()*tarif;
	}
}
