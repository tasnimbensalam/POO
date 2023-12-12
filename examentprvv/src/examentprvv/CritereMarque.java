package examentprvv;

public class CritereMarque implements Critere{
private String Marque;

	public CritereMarque(String marque) {
	Marque = marque;
}

	@Override
	public boolean correspond(Object o) {
		
		if(o instanceof Voiture) {
			return this.Marque.equals(((Voiture)o).getMarque());
		}
		else {
			return false;
		}
	}
	
}
