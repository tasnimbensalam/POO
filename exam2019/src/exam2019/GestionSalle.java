package exam2019;

public class GestionSalle {

	public static void main(String[] args) {
		Salle s1=new SalleCours(101,10,6.8f,"Gestion",true,false);
		Salle s2=new SalleCours(102,15,20,"informatique",true,true);
		Salle tab[]=new Salle[5];
		tab[0]=s1;
		tab[1]=s2;
	
		
		for (int i=0;i<2;i++) {
			if (tab[i].isConnected()) {
				if(tab[i].getSurface()<8) {
					
					Bureau b=new Bureau(tab[i].getSurface(),tab[i].getNbplaces(),tab[i].getdepartement(),tab[i].isConnected());
					try {
						b.ajoutEnseignant("mohamed");
						b.ajoutEnseignant("salah");
					}catch(BureauPleinException e) {
						e.getMessage();
						e.printStackTrace();
					}
					tab[i]=b;
				}
			}
			else {
				Labo l= new Labo(9, tab[i].getNbplaces(), tab[i].getdepartement(),tab[i].isConnected(), 10);

						tab[i]=l;
			}
		}

	}

}
