package tp3;

public class Personne {

	
	private String nom;
	private String prenom;
	private String adress;
	Personne(String nom, String prenom, String adress)
	{
		this.nom=nom;
		this.prenom=prenom;
		this.adress=adress;
	}

String getnom()
{
	return this.nom;}
String getprenom()
{
	return this.prenom;} 
String getadress()
{
	return this.adress;}
 public String toString() {
	 return "\n nom : "+this.nom+"\nprenom :"+this.prenom+"\nadresse : "+this.adress;
 }

}

