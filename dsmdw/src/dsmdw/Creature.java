package dsmdw;

class Creature extends Carte{
	private String nom;
	private int nbrdegat;
	private int nbrvie;
	Creature(double cout,String nom,int nbrdegat,int nbrvie){
		super(cout);
		this.nom=nom;
		this.nbrdegat=nbrdegat;
		this.nbrvie=nbrvie;
		//System.out.println("une nouvelle "+getClass().getSimpleName()+"de plus");
		
	}
	@Override()
	public String toString() {
		return getClass().getSimpleName()+" "+this.nbrdegat+"/"+this.nbrvie;
	}
	
}
