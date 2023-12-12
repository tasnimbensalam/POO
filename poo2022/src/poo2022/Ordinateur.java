package poo2022;
/*materielinfo*/
import java.util.Arrays;

public class Ordinateur extends MaterielInfo implements Affichable{

	   private String marque;
	    private String description;
	    private String[] connexions;

	    public Ordinateur(long reference, double prixHorsTaxe, int quantiteEnStock,
	                      String marque, String description, String[] connexions) {
	        super(reference, prixHorsTaxe, quantiteEnStock);
	        this.marque = marque;
	        this.description = description;
	        this.connexions = connexions;
	    }


@Override
		public String toString() {
			return "Ordinateur [marque=" + marque + ", description=" + description + ", connexions="
					+ Arrays.toString(connexions) + ", ref=" + ref + "]";
		}


@Override
double prixVente() {
	
	return this.getPrix()+(0.15*this.getPrix());
}
@Override
public void afficheToi() {
	System.out.println(this.toString());
	
}

}
