package tpfichier;

import java.io.File;
import java.io.FilenameFilter;

public class Filtre implements FilenameFilter {
	 private char lettre;

	 public Filtre(char lettreDébut) {
	 lettre = lettreDébut;
	 }
	 public boolean accept(File repFiltre, String nom) {
	 return nom.charAt(0)==lettre;
	 }
	public boolean accept1(File dir, String name) {
		// TODO Auto-generated method stub
		return false;
	}
	}