package examentprvv;

public class CriterePrix implements Critere{

	private double prix;
	

	public CriterePrix(double prix) {
		this.prix = prix;
	}

	@Override
	public boolean correspond(Object o) {
		if(o instanceof Voiture) {
			return (this.prix>=((Voiture) o).getPrix());
		}
		else {
			return false;
		}
		
	}

}
