package tp5classeabstraite;

public class Fiscalite{


	public static void main(String[] args) {
		Personne p1=new Personne(4,"nom","prenom");
		Personne p2=new Personne(4,"nom2","prenom");
		Personne p3=new Personne(4,"nom3","prenom");
		Lotissement l=new Lotissement(10);
		Propriete pr=new PropieteProfessionelle(4,p3,"Korba", 1000, 50,true);
		Propriete pr4=new ProprietePrivee(1,p1,"Corniche",350,4);
		Propriete pr2=new Villa(2,p2,"Dar Chaabane", 400,6,true);
		Propriete pr3=new Appartement(3,p2,"Hammamet",1200,8,3);
		Propriete pr5=new PropieteProfessionelle(5,p1,"Bir Bouragba",2500, 400, false);
		l.ajouter(pr);
		l.ajouter(pr2);
		l.ajouter(pr3);
		l.ajouter(pr4);
		l.ajouter(pr5);
		l.afficherProprietes();
		int nb=l.getnbPieces();
		System.out.println("nbr de pieces "+nb);
		l.supprimer(pr3);
		l.afficherProprietes();
		Lotissement lt= new LotissementPrivee(10);
		lt.ajouter(pr4);
		lt.getpropriétéByIndice (0);
		int nb1=lt.getnbPieces();
		System.out.println("nbr de pieces "+nb1);
	}

}
