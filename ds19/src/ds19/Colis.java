package ds19;

class Colis extends Courrier {
	private double poid;
	private double volume;
	Colis(double poids,double volume,boolean mode,String ad){
		super( mode, ad);
		this.volume=volume;
		this.poid=poids;
	}
	@Override()
	public void decrire() {
		super.decrire();
		System.out.println("le poid est"+this.poid+"\nle volume est"+this.volume);
		
		
	}
	@Override()
	public double affranchir() {
		if(super.estValide()) {
			return 0.25*this.volume+this.poid*0.1;
		}
		else {
			return 0;
		}
	}
}
