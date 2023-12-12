package examentprv;

public class Epreuve {
	Candidat[] tab;
	int max;
	int nbefi=0;
	private boolean etat=false;
	public boolean isEtat() {
		return etat;
	}
	public void setEtat(boolean etat) {
		this.etat = etat;
	}
	String denomination;
	public Epreuve(String denomination,int max) {
		tab=new Candidat[max];
		this.denomination=denomination;
	}
	@Override
	public String toString() {
		if(etat==true)
		{
			return "Epreuve [etat= terminee] , [denomination= "+ denomination + "]";}
		else {
			return "Epreuve [etat= non terminee ], [denomination= "+ denomination + "]";
		}

		}
	void ajoutCandidat(Candidat a) {
		if(this.nbefi+1<this.max) {
			tab[nbefi]=a;
			this.nbefi++;
			
		}
	}
	void terminer () {
		this.etat=true;
		}
	boolean estTerminee() {
		return this.etat;
	}
	Resultat getRecord() {
	    Resultat r = tab[0].getResultat();
	    for (int i = 1; i < this.nbefi - 1; i++) {
	        if (tab[i].getResultat().compareTo(tab[i + 1].getResultat()) == 1) {
	            r = tab[i + 1].getResultat();
	        } 
	    }
	    return r;
	}
	 public Candidat getVinqueur() {
		
		 Candidat c=null;
		 if(this.etat==true) {
			for(int i=0;i<this.nbefi;i++) {
				if(tab[i].getResultat().compareTo(getRecord())==0) {
					 c=tab[i];
					 break;
				}
			}
		 }
		 return c;
	
	 }
	 void fixeResultat(int id, Resultat r) {
		 if(etat==false) {
			 for(int i=0;i<this.nbefi;i++) {
			 if(tab[i].getId()==id) {
				 tab[i].setResultat(r);
			 }
		 }
	 }
		 }
	public Resultat getResultat(int id) {
		 for(int i=0;i<this.nbefi;i++) 
		 {
			 if(tab[i].getId()==id) {
				 
				 return tab[i].getResultat();
			 }
			
		 }
		 
	 return null;

}
	}
