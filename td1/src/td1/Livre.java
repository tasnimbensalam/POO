package td1;

class Livre {
private String titre, auteur;
private float nbPages;
private double prix;
private boolean prixFixe=false;


Livre (String auteur, String titre) 
{
	this.auteur =auteur;
    this.titre = titre;
}


public String getauteur() {return this.auteur;}
public String setauteur(String auteur) {return this.auteur=auteur;}


//ex1
public float getnbpages() {return this.nbPages;}

public void setnbpages (float nb) {
	if(nb>20)
	{nbPages = nb;}
	else {
		System.out.println("faible");
	}
	}


//ex3
public double getprix() {
	return this.prix;
	}
public void setprix (double prix ) {
	if(!testPrix())
	
	{
	this.prix=prix;
	prixFixe=true;
	System.out.println("nouveau prix est fixé pour ce livre : "+this.titre);}
	else
	{
		System.out.println("prix de ce livre "+this.titre+" est deja fixé");
	}
	
}




public static void nafssauteur(Livre l,Livre l1)
{ 
	if(l.auteur.equals(l1.auteur))
	{
		System.out.println("ont le meme auteur");
	}
	else
	{
		System.out.println("n'ont pas le meme auteur");
	}
	}


public String toString()
{
	return "Livre intitulé "+this.titre+" de "+this.auteur+" contenat "+this.nbPages;
}

//ex2
public void decrire() {
	System.out.println(this.toString());
}
//ex3
public void decrir() {
	System.out.println(this.toString()+" \n son prix est : "+this.prix);
}
Livre()
{
	this.titre = "";
    this.auteur = "";
	this.nbPages=0;
}
Livre(String titre, float nbPages) {
    this.titre = titre;
    this.nbPages = nbPages;
    this.auteur = "";
}
Livre(String titre, String auteur, float nbPages) {
    this.titre = titre;
    this.auteur = auteur;
    this.nbPages = nbPages;}


//ex3 :

Livre(String titre, String auteur, float nbPages,double prix) {
    this.titre = titre;
    this.auteur = auteur;
    this.nbPages = nbPages;
    this.prix=prix;}

private boolean testPrix() {
	if(prix>0)
	{
		return true;
		
	}
	else {
		return false;
	}
}
}