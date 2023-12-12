package poo2022;

import java.util.Objects;

public abstract class MaterielInfo {
protected long ref;
private  double prix;
private int qte;
public MaterielInfo(long ref, double prix, int qte) {
	super();
	this.ref = ref;
	this.prix = prix;
	this.qte = qte;
}
public MaterielInfo(long l) {
	
	this.ref = l;
}
public long getRef() {
	return ref;
}
public void setRef(long ref) {
	this.ref = ref;
}
public double getPrix() {
	return prix;
}
public void setPrix(double prix) {
	this.prix = prix;
}
public int getQte() {
	return qte;
}
public void setQte(int qte) {
	this.qte = qte;
}


public boolean equals(MaterielInfo m) {
	return this.ref == m.ref;
		

}
@Override
public String toString() {
	return "MaterielInfo [ref=" + ref + ", prix=" + prix + ", qte=" + qte + "]";
}
 
abstract double prixVente();



}
