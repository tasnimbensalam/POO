package tdHeritage;

class Roman extends Livre {
	private String nomedi;
	private String auteur;
	Roman(int id, String nom, int nbrp, String domaine,String nomedi,String auteur) {
		super( id, nom, nbrp, domaine);
		this.nomedi=nomedi;
		this.auteur=auteur;
	}
@Override
public String toString()
{
	
		return super.toString()+"\nle nom de l'auteur est : "+auteur+"\nle nom de lediteur est : "+nomedi;
}
@Override
double calculePrix(){
	return (0.05*super.nbrp)*(1+super.tva);
}


}
