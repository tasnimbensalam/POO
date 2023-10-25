package ds19;

class Lettre extends Courrier{
	private double poids;
	private String format;
	Lettre(double poids,String format,boolean mode,String ad){
		super(mode,ad);
		this.poids=poids;
		if(format.toUpperCase()=="A3" || format.toUpperCase()=="A4")
		{this.format=format.toUpperCase();}
	}
	@Override()
	public void decrire() {
		super.decrire();
		System.out.println("le poid est : "+this.poids+"\nle format est : "+this.format);
		
		
	}
	@Override()
	public double affranchir() {
		/*if(super.estValide()) {
			if (mode==true){
				if(format.toUpperCase().equals("A4"))
				{return ((tarif+0.5*this.poids/1000)+2.5)*2;}
				else {
					return  ((tarif+0.5*this.poids/1000)+2.5)*2;
				}
			}
			else
			{
				if(format.equals("A4"))
				{return (tarif+0.5*this.poids/1000)+2.5;}
				else {
					return  (tarif+0.5*this.poids/1000)+2.5;
				}
			}
		}
		else {
			return 0;
		}
		}*/
		double montant=0;
		if(super.estValide()) {
			if(format.toUpperCase().equals("A4")) {
				montant=2.5;
			}
			else if(format.toUpperCase().equals("A3")) {
				montant=3.5;
			}
			montant +=(tarif+0.5*this.poids/1000);
			if(super.mode) {
				montant *=2;
			}
			
		}
		return montant;
	}
}
