package dsmdw;

class Sortilege extends Carte{
	private String nom;
	private String expli;
	Sortilege(double cout,String nom,String expli){
		super(cout);
		this.nom=nom;
		this.expli=expli;
		//System.out.println("un "+getClass().getSimpleName()+"de plus");
	}
	@Override()
	public String toString() {
		return getClass().getSimpleName()+" "+this.nom;
	}
	

}
