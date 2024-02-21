package collections;

import java.util.ArrayList;
import java.lang.Comparable;
public class Note implements Comparable<Note>,Statisticable {
	private String intitule;
	private float note;
	

public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public float getNote() {
		return note;
	}

	public void setNote(float note) {
		this.note = note;
	}

public Note(String cours, float note) {
		this.intitule=cours;
		this.note=note;
	}

@Override
public int compareTo(Note n) {
	if(this.getNote()==n.getNote()) {
		return 0;
	}
	else if(this.getNote()>n.getNote()) {
		return 1;
	}
	else {
		return -1;
	}
}

@Override
public float getValue() {
	return this.note;
}





}
