package collections;
import java.util.ArrayList;
public class Etudiant implements Statisticable,Comparable<Etudiant > {
private Integer matricule;
private String nom;


public Etudiant(Integer matricule, String nom) {
	super();
	this.matricule = matricule;
	this.nom = nom;
	this.notes = new ArrayList<Note>();
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public ArrayList<Note> getNotes() {
	return notes;
}

public void setNotes(ArrayList<Note> notes) {
	this.notes = notes;
}

private ArrayList<Note> notes;

public void addNote(String cours, float note) {
    Note n = new Note(cours, note);
    notes.add(n);
}




public float noteMoyenne() {
	float m=0;
	for(Note n : this.notes) {
		m+=n.getNote();
	}
	return m/this.notes.size();
}

@Override
public int compareTo(Etudiant e) {
	if(this.noteMoyenne()==e.noteMoyenne()) {
		return 0;
	}
	else if(this.noteMoyenne()>e.noteMoyenne()) {
		return 1;
	}
	else {
		return -1;
	}
}


@Override
public float getValue() {
	return this.noteMoyenne();
}

public Integer getMatricule() {
	return matricule;
}

public void setMatricule(int matricule) {
	this.matricule = matricule;
}
}
