package fr.hotel;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;


	public class FabriquePetitDej {
	    private static final String CHAMP_CHAMBRE = "chambre";
	    private static final String CHAMP_HEURE = "heure";
	    private static final String CHAMP_NB_REPAS = "nombreDeRepas";
	    private static final String CHAMP_COMMENTAIRES = "commentaire";

	    public Map<String, String> erreurs = new HashMap<>();
	    public boolean succesCreation = false;
	    

	    public PetitDejeuner construitPetitDejeuner(HttpServletRequest request) {
	        int chambre = 0;
	        String heure = null;
	        int nombreDeRepas = 0;
	        String commentaire = null;

	        try {
	            chambre = Integer.parseInt(request.getParameter(CHAMP_CHAMBRE));
	            validationChambre(chambre);
	        } catch (NumberFormatException e) {
	            erreurs.put(CHAMP_CHAMBRE, "Le numéro de chambre doit être un entier.");
	        } catch (Exception e) {
	            erreurs.put(CHAMP_CHAMBRE, e.getMessage());
	        }

	        heure = request.getParameter(CHAMP_HEURE);
	        try {
	            validationHeure(heure);
	        } catch (Exception e) {
	        	  erreurs.put(CHAMP_CHAMBRE, "Le numéro de chambre doit être un entier.");
	        }

	        try {
	            nombreDeRepas = Integer.parseInt(request.getParameter(CHAMP_NB_REPAS));
	        } catch (NumberFormatException e) {
	            erreurs.put(CHAMP_NB_REPAS, "Le nombre de repas doit être un entier.");
	        }

	        commentaire = request.getParameter(CHAMP_COMMENTAIRES);

	        if (erreurs.isEmpty()) {
	            succesCreation = true;
	        } else {
	            succesCreation = false;
	        }

	        return new PetitDejeuner(chambre, nombreDeRepas, heure, commentaire);
	    }

	    private void validationChambre(int chambre) throws Exception {
	        if (chambre < 100 || chambre > 200) {
	            throw new Exception("Le numéro de chambre doit être contenu entre 100 et 200.");
	        }
	    }

	    private void validationHeure(String heure) throws Exception {
	        if (Integer.parseInt(heure)<=6 && Integer.parseInt(heure)>=10) {
	            throw new Exception("L'heure doit être valide.");
	        }
	    }

	    public Map<String, String> getErreurs() {
	        return erreurs;
	    }
			
			
		
		
		
	    	
	    }
	    