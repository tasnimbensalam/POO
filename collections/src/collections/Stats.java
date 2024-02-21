package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Stats  {

public Note minNote(Etudiant e) {
	    return Collections.min(e.getNotes());
	}
public Note maxNote( Etudiant e) {
    return Collections.max(e.getNotes());
}
public Etudiant minE(Etudiant[] e) {
    return Collections.min(Arrays.asList(e));
}
public Etudiant maxE( Etudiant[] e) {
return Collections.max(Arrays.asList(e));
}
public Etudiant meilleurEtudiant(ArrayList<Etudiant> etudiants) {
    return Collections.max(etudiants);
}

public Etudiant moinsBonEtudiant(ArrayList<Etudiant> etudiants) {
    return Collections.min(etudiants);
}
public void trierEtudiantsParMatricule(ArrayList<Etudiant> etudiants) {
    Collections.sort(etudiants);
}

public float MoyenneGroupe(ArrayList<Etudiant> etudiants) {
	float max=0;
	for(Etudiant e : etudiants) {
		max=e.getValue();
		
	}
	return max/etudiants.size();
}



}
