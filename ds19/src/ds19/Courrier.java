package ds19;

class Courrier {
	protected boolean mode;
	protected String adress;
	protected final static double tarif=0.5;
	Courrier(boolean mode,String ad){
		this.mode=mode;
		this.adress=ad;
	}
	public boolean estValide() {
		return (this.adress!="");
	}
	public void decrire() {
		System.out.println("le type du courrier est : "+getClass().getSimpleName() +"\nl'adress du courrier est : "+this.adress+"\n le prix"+this.affranchir());
		if (this.mode){
			System.out.println("\nexpress");
		}
		else
		{
			System.out.println("\nnormal");
		}
	}
	public double affranchir() {
		if(estValide()) {
			if (this.mode){
				return tarif*2;
			}
			else
			{
				return tarif;
			}
		}
		else {
			return 0;
		}
		
	}
	
	
}
