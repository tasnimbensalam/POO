package exam2019;

public class Labo extends Salle{
private int nbPC;
	public Labo(int num, int nbPlaces, float surface, String departement, boolean connected,int nbPC) {
		super(num, nbPlaces, surface, departement, connected);
		this.nbPC=nbPC;
	}

	@Override
	void decrire() {
		
		System.out.println(this.getClass().getSimpleName()+super.toString()+"nombre pcs ="+this.nbPC);
		
	}

}
