package exam2019;

public class CritereRattrapage implements CritereReservation {
private int nbplace;

	public CritereRattrapage(int nbplace) {
	this.nbplace = nbplace;
}

	@Override
	public boolean peuEtreReservee(Salle s) {
		if(s instanceof SalleCours && ((SalleCours) s).isVideoProj() && nbplace>=s.getNbplaces()) {
			return true;
		}
		else {
			return false;
		}
	}

}
