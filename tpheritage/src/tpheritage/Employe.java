package tpheritage;

public class Employe extends Salarie
{
	private double Hsupp;
	private double PHsupp;
	Employe(int mat,String n,double r,double Hsup,double PHsup)
	{
		super( mat, n,r);
		this.Hsupp=Hsup;
		this.PHsupp=PHsup;
	}
	void setHsup(double hsup) {
		this.Hsupp=hsup;
		
	}
	void setPHsup(double phsup) {
		this.PHsupp=phsup;
		
	}
	double getHsup() {
		return this.Hsupp;
	}
	double getPHsup() {
		return this.PHsupp;
	}
	void Affichclass() {
		System.out.println();
	}
	@Override()
	public void affiche() {
		super.affiche();
		System.out.println(this.getClass().getSimpleName()+ ",hsupp  "+Hsupp+", phsupp\n"+PHsupp);
	}
	@Override()
	public double salaire() {
		
		return (super.salaire()+Hsupp*this.PHsupp);
	}
	
}	
