package exam2019;

public abstract class Salle {
private int num,nbPlaces;
private float surface;
private String departement;
private boolean connected;
public Salle(int num, int nbPlaces, float surface, String departement, boolean connected) {
	super();
	this.num = num;
	this.nbPlaces = nbPlaces;
	this.surface = surface;
	this.departement = departement;
	this.connected = connected;
}
public float getSurface() {
	return surface;
}
public String getdepartement() {
	return departement;
}
public int getNbplaces() {
	return this.nbPlaces;
}
public boolean isConnected() {
	return connected;
}

@Override
public String toString() {
	return "Salle [num=" + num + ", nbPlaces=" + nbPlaces + ", surface=" + surface + ", departement=" + departement
			;
}
abstract void decrire();

}
