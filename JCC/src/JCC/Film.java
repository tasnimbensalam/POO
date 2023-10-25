package JCC;

import java.util.Scanner;

class Film {
	private String titre;
	private String realisateur;
	private String pays;
	private int duree;
	private int nbrp;
	int getNBRP() {
		return this.nbrp;
	}
	void setNBRP(int nbr) {
		this.nbrp=nbr;
	}
	public String toString() {
		return this.titre+" de "+this.realisateur+" ("+this.pays+")"+" -"+this.duree+"min";
	}
	Film(String titre,String r,String pays,int d){
		this.titre=titre;
		this.realisateur=r;
		this.pays=pays;
		this.duree=d;
	}
	float totalVenteBillet() {
		
		Scanner Scanner = new Scanner(System.in);
		System.out.println("entrer nombre des etudiants");
		int nbretudiant=Scanner.nextInt();
		while(nbretudiant>nbrp) {
			Scanner Scanner1 = new Scanner(System.in);
			System.out.println("entrer nombre des etudiants");
			int nbretudiant1=Scanner1.nextInt();
		}
		int nbrpubli=nbrp-nbretudiant;
		return nbretudiant*2 + nbrpubli*3;
	}
	
}
