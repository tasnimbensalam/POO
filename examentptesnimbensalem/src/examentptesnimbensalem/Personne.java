package examentptesnimbensalem;

public class Personne {
private int age;
private int taille;
private String nom;
public Personne(int age, int taille, String nom) {
	super();
	this.age = age;
	this.taille = taille;
	this.nom = nom;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getTaille() {
	return taille;
}
public void setTaille(int taille) {
	this.taille = taille;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}


}
