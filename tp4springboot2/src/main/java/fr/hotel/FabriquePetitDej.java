package fr.hotel;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public class FabriquePetitDej {
	private static final String CHAMP_CHAMBRE = "chambre";
	private static final String CHAMP_HEURE = "heure";
	private static final String CHAMP_NB_REPAS = "nombreDeRepas";
	private static final String CHAMP_COMMENTAIRES = "commentaires";
	public boolean succesCreation = false;
    
	    public PetitDejeuner construitPetitDejeuner( HttpServletRequest request) throws Exception {
	    	int chambre = Integer.parseInt(request.getParameter("chambre"));
			int nombreDeRepas = Integer.parseInt(request.getParameter("nombreDeRepas"));
			String heure = request.getParameter("heure");
			String commentaire = request.getParameter("commentaire");
			
	    try {
	        validationChambre(chambre);
	        validationHeure(heure);
	        
	        succesCreation = erreurs.isEmpty();
	        return new PetitDejeuner(chambre, nombreDeRepas, heure, commentaire);
	    } catch (Exception e) {
	       
	        erreurs.put("validation", e.getMessage());
	        
	        return null;}
	    }
	    private void validationChambre( int chambre ) throws Exception {
	    	if (( chambre < 100 ) || ( 200 < chambre ))
	    	{
	    	throw new Exception( "Le numéro de chambre doit être contenu entre 100 et 200." );
	    	}}
	    	
	    	
	    	  private void validationHeure(String heure) throws Exception{
	  	    	if(heure ==null) {
	  	    		throw new Exception("La livraison en chanmbre ne peut être choisie qu'entre 6h et 10h");
	  	    	}
	    	}
	    	  private Map<String, String> erreurs = new HashMap<String, String>();

			
		
		
		
	    	
	    }
	    