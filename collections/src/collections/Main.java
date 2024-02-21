package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        
     
      
        Etudiant e1 = new Etudiant(1,"John Doe");
        e1.addNote("Math", 12);
        e1.addNote("Physique", 15);
        e1.addNote("Chimie", 18);

        Etudiant e2 = new Etudiant(2, "Jane Doe");
        e2.addNote("Math", 12);
        e2.addNote("Physique", 15);

        
        ArrayList<Etudiant> etudiants = new ArrayList<>();
        etudiants.add(e1);
        etudiants.add(e2);

       
        Stats stats = new Stats();

       
        for (Etudiant etudiant : etudiants) {
            System.out.println("Min note for " + etudiant.getNom() + ": " + stats.minNote(etudiant).getIntitule() + " (" + stats.minNote(etudiant).getNote() + ")");
            System.out.println("Max note for " + etudiant.getNom() + ": " + stats.maxNote(etudiant).getIntitule() + " (" + stats.maxNote(etudiant).getNote() + ")");
        }

       System.out.println("meilleur moyenne du grp "+stats.MoyenneGroupe(etudiants));
       
        Collections.sort(etudiants, new CompareMatricule());
        System.out.println("par matricule:");
        for (Etudiant etudiant : etudiants) {
            System.out.println(etudiant.getNom() + " (" + etudiant.getMatricule() + ")");
        }

       
      
       
        Collections.sort(etudiants, new CompareNom());
        System.out.println("par nom:");
        for (Etudiant etudiant : etudiants) {
            System.out.println(etudiant.getNom());
        }
    }
}