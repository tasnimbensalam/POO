package poo2022;

public class BoutiqueInfo {
private MaterielInfo tab[]=new MaterielInfo[100];
int nb=0;
void ajoutMateriel(MaterielInfo i) {
	
	   for(int j=0;j<nb;j++) {
	
		if(i.equals(tab[j])) {
			  tab[j].setQte(tab[j].getQte() + 1);
		}
		break;
	   }
		 if(nb<100){
			tab[nb]=i;
			nb++;
		}
		else {
			System.out.println("plein");
		}
	}

void affichboutiq() {
	for(int i=0;i<nb;i++) {
		((Ordinateur)tab[i]).afficheToi();
	}
}
void venteMateriel(long ref,int qte) throws ExceptionQte {
	 for(int i=0;i<nb;i++) {
		 if(tab[i].getRef()==ref && tab[i].getQte()>=qte) {
			 tab[i].setQte(tab[i].getQte()-qte);
			 break;
		 }
		 else {
			 throw new ExceptionQte("qte inssuffisant");
		 }
	 }
}


}
