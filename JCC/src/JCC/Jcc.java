package JCC;

class Jcc {
	private Film[] competition;
	private int annee;
	private final int NBFMAX=30;
	private int nbF=0;
	Jcc(int n,int an){
		competition=new Film[n];
		this.annee=an;
	}
	void ajoutFilm(Film f){
		if(nbF<NBFMAX) {
			competition[nbF]=f;
			nbF+=1;
		}
		else {
			System.out.println("\ncomplet");
		}
	}
	void listeFilmsJCC() {
		for(int i=0;i<nbF;i++) {
			System.out.println(competition[i].toString());		}
	}
	double totalVenteBilletJCC() {
		double s=0;
		for(int i=0;i<nbF;i++) {
			s+=competition[i].totalVenteBillet();
		}
		return s;
	}
	}
