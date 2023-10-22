package tdHeritage;

class Livre {
	protected int id;
	protected String nom;
	protected final float tva=(float) 0.1;
	protected int nbrp;
	protected String domaine;
	Livre(int id,String nom,int nbrp,String domaine){
		this.id=id;
		this.nom=nom;
		this.nbrp=nbrp;
		this.domaine=domaine;
	}
	public int getId() {
		return id;
	}
	
    public  String toString() {
		return "l'id est "+id+"\nle nom est "+nom+"\nnb page est "+nbrp+"\nle domaine est "+domaine;
	}
   
    double calculePrix() {
    	return (0.075*nbrp)*(1+tva);
    }
	
    
}
