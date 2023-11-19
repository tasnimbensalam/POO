package abstraites;

abstract class Article {
private int ref;
private String lib;
private double prixHT;
private int qte;
private final double tva=10;
	
	public Article(int ref, String lib, double prixHT, int qte) {
	
	this.ref = ref;
	this.lib = lib;
	this.prixHT = prixHT;
	this.qte = qte;
}
	public int getRef() {
		return ref;
	}
	public void setRef(int ref) {
		this.ref = ref;
	}
	public String getLib() {
		return lib;
	}
	public void setLib(String lib) {
		this.lib = lib;
	}
	public double getPrixHT() {
		return prixHT;
	}
	public void setPrixHT(double prixHT) {
		this.prixHT = prixHT;
	}
	public int getQte() {
		return qte;
	}
	public void setQte(int qte) {
		this.qte = qte;
	}
	public double getTva() {
		return tva;
	}
	void approvisionner(int nb) {
		this.qte+=nb;
	}
	void decrire() {
		System.out.println("la reference : "+this.ref+"\nl'intitulé : "+this.lib);
	}
	abstract double calculPrixTTC();
	boolean appartientPromo() {
		if(this.lib.equals("vetement") ||this.lib.equals("electronique") ) {
			return true;
		}
		else {
			return false;
		}
	}
	boolean estDispo(int qteAchat) {
		if(this.qte>=qteAchat) {
			return true;
		}
		else {
			return false;
		}
	}
	
		
	

}
