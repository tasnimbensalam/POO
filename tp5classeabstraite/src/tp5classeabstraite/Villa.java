package tp5classeabstraite;

class Villa extends ProprietePrivee{
	boolean avecPiscine;
	Villa(int id, Personne r, String a, double s, int nbpieces,boolean avec) {
		super(id, r, a, s, nbpieces);
		this.avecPiscine=avec;
	}
	@Override()
	public String toString() {
		if(this.avecPiscine==true)
		{return super.toString()+"\navec piscine";
	}
		else {
			return super.toString()+"\nsans piscine";
		}
	
}
	@Override
	double calculimpot() {
		if (this.avecPiscine==true) {
			return super.calculimpot()+200;
		}
		else {
			return 0;
		}
	}}
