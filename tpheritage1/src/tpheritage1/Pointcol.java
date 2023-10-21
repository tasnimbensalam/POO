package tpheritage1;

class Pointcol extends Point {
	private String couleur;
	Pointcol(String couleur,char nom, int abs, int ord){
		this.couleur=couleur;
		this.nom=nom;
		this.abs=abs;
		this.ord=ord;
	}
	Pointcol(){
		super();
	}
	public void setCouleur(String couleur) {
		this.couleur=couleur;
	}
	@Override()
	public void affiche() {
		super.affiche();
		System.out.println("sa couleur est :"+couleur);
	}
	
}
