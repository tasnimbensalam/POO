package tp5classeabstraite;

 class ProprietePrivee extends Propriete{
	private int nbPieces;
	ProprietePrivee(int id, Personne r, String a, double s,int nbpieces) {
		super(id, r, a, s);
		this.nbPieces=nbpieces;
	}
	@Override
	double calculimpot() {
		return this.getSurface()/2+10*this.nbPieces;
	}
	public int getnbPiece() {
		return this.nbPieces;
	}

	

}
