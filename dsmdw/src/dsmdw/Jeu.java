package dsmdw;

class Jeu {
	private Carte[] tabcartes;
	private int nb;
	Jeu(int nb){
		this.tabcartes=new Carte[10];
		this.nb=nb;
		System.out.println("on change de main");
	}
	void ajouter(Carte c) {
		if(nb<tabcartes.length) {
			tabcartes[nb]=c;
			nb++;
		}
		else {
			System.out.println("espace insuffisant");
		}
		
		if( "Creature".equals(c.getClass().getSimpleName()))
		{System.out.println("une nouvelle "+c.getClass().getSimpleName());
		}
		else if("Sortilege".equals(c.getClass().getSimpleName())) {
			System.out.println("un "+c.getClass().getSimpleName()+" de plus");
		}
		else {
			System.out.println("un nouveau "+c.getClass().getSimpleName());
		}
	}
	void jouer() {
		
		    int i=0;
			while ((i<nb)&&(tabcartes[i]==null)){ i++;}
			System.out.println("\n*********la carte jouee est :\n");
			System.out.println(tabcartes[i]);
			tabcartes[i]=null;
			
		}
	
	void afficher() {
		for(int i=0;i<nb;i++) {
			System.out.println(tabcartes[i]);
		}
	}
	
	 
}
