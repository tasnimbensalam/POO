package TP2COLLECTIONS;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
class DossierPharmacie{
	private String nom ;
	private HashMap <String , Patient > patients ;
	public DossierPharmacie ( String n){
	nom =n;
	patients = new HashMap <String , Patient >();
	}
	
	void nouveauPatient ( String nom , String [] ord ){
	Patient p=new Patient(nom);
	for (String m : ord) {
        p.ajoutMedicament(m);
    }
	}
	public boolean ajoutMedicament (String nom, String m){
		 Patient patient = patients.get(nom.toLowerCase());
	        if (patient != null) {
	            patient.ajoutMedicament(m);
	            return true;
	        }
	        return false;
	}
	public void affichePatient(String nom) {
        Patient patient = patients.get(nom.toLowerCase());
        if (patient != null) {
            patient.affiche();
        } else {
            System.out.println("Patient non trouvé.");
        }
    }

    public void affiche() {
        System.out.println("Nom de la pharmacie : " + nom);
        System.out.println("Liste des patients : ");
        for (Patient patient : patients.values()) {
            patient.affiche();
        }}
    
    public Collection <String>affichePatientAvecMedicament(String m){
	Collection <String> c=new ArrayList<String>();
	for (Patient patient : patients.values()) {
		if (patient.contientMedicament(m));
		{
			c.add(patient.getNom());
		}
	}
	return c;
}
	}

