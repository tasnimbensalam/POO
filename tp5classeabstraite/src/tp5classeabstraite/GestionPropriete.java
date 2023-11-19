package tp5classeabstraite;

public interface GestionPropriete {
	public static final int max_proprietes= 40;
	
	boolean ajouter(Propriete p) ;
	boolean supprimer(Propriete p);
	void afficherProprietes();
	
	
}
