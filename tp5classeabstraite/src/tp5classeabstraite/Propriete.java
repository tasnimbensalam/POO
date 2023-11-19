package tp5classeabstraite;

abstract class Propriete {
	private int id;
	private Personne responsable;
	private String adresse;
	private double surface;
	Propriete(int id,Personne r,String a,double s){
		this.id=id;
		this.adresse=a;
		this.responsable=r;
		this.surface=s;
				
	}
	double getSurface() {
		return this.surface;
	}
	int getId() {
		return this.id;
	}
	public String toString() {
		return "l'id : "+this.id+"\nl'adresse : "+this.adresse+"\nle responsable : "+this.responsable+"\nla surface : "+this.surface+"\nl'impot"+this.calculimpot();
	}
	abstract double calculimpot() ;
	 public boolean equals(Object o) {
		 return this.id==((Propriete) o).getId();
	 }
}
