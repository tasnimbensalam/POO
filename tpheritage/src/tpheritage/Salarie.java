package tpheritage;

public class Salarie {
	 private int matricule;
	private String nom;
	private double recrutement;
	
	Salarie(int mat,String n,double r){
		this.matricule=mat;
		this.nom=n;
		this.recrutement=r;
	}
	void setMatricule(int mat)
	{
		this.matricule=mat;
	}
	void setMatricule(String nom)
	{
		this.nom=nom;
	}
	public void setMatricule(double r)
	{
		this.recrutement=r;
	}
	public int getMatricule() {
		return this.matricule;
	}
	public String getNom() {
		return this.nom;
	}
	public double getRecrutement()
	{
		return this.recrutement;
	}
	public String toString() {
		return "la matricule est "+this.matricule+", le nom est "+this.nom+", l'annee de recrutement est "+this.recrutement;
	}
	void affiche() {
		System.out.println(this);
	}
	double salaire()
	{
		if(this.recrutement>=2005) {
			return 400;
		}
		else {
			return 280;
		}
	}
	
	
	
}



