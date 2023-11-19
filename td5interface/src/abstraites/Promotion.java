package abstraites;

import java.time.LocalDate;

public interface Promotion  {

	LocalDate debutPromo= LocalDate.of(2022, 03, 19);
	LocalDate finPromo=LocalDate.of(2022, 03, 31);
	 abstract double prixDeVente(String dateStr);
	 default boolean estPeriodePromo(String dateStr) {
		 LocalDate dateAchat = LocalDate.parse(dateStr);
	        return (dateAchat.isEqual(debutPromo) || dateAchat.isAfter(debutPromo)) &&
	               (dateAchat.isEqual(finPromo) || dateAchat.isBefore(finPromo));
	 }
	 static double calculerRemise(double prixAvantRemise, double prixApresRemise) {
		 return ((prixAvantRemise-prixApresRemise)/prixAvantRemise)*100;
	 }
	 
	 
	
	
	

}
