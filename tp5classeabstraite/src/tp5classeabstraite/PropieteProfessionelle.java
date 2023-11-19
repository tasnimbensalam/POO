package tp5classeabstraite;

 class PropieteProfessionelle extends Propriete{
	int nbEmployes;
	boolean estEtatiq;
	PropieteProfessionelle(int id, Personne r, String a, double s,int nbem,boolean est) {
		super(id, r, a, s);
		this.nbEmployes=nbem;
		this.estEtatiq=est;
	}
	@Override
	double calculimpot() {
		if(this.estEtatiq==true) {
			return 0;
		}
		else {
			return 30*this.nbEmployes+super.getSurface();
		}
	}

}
