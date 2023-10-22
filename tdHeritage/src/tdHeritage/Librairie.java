package tdHeritage;

class Librairie  {
	
		private Livre[] liste;
		private int capacite,nb=0;
		Librairie(int capacite){
			this.capacite=capacite;
			liste=new Livre[capacite];
		}
		public int getNB() {
			return nb;
		}
		public  void inventaire() {
			for(int i=0;i<nb;i++) {
				System.out.println(liste[i].toString());
				if(liste[i] instanceof Magazine) {
					Magazine magazine=(Magazine)liste[i];
					System.out.println("\nle prix est :"+magazine.calculePrix(10));
				}
				else
					System.out.println("\nle prix est :"+liste[i].calculePrix());
			}
		}
		public void inventaire(String categ) {
			for(int i=0;i<nb;i++) {
				if(categ.equals(liste[i].getClass().getSimpleName())) {
					System.out.println(liste[i].toString());
				}
				
			}
		}
		public void ajoutLiv(Livre liv) {
			if(nb+1<=capacite)
			{this.liste[nb]=liv;
			nb++;}
			else
			{
				System.out.println("ajout indispo");
			}
			
		}
		void suppLiv(int num) {
			for(int i = 0;i<liste.length;i++) {
				if(liste[i].getId()==num) {
					for(int j = i;j<nb-1;j++)
					{liste[j]=liste[j+1];}
					nb--;
				}
			}}
		double montant() {
			double tp=0;
			for(int i=0;i<nb;i++) {
				if(liste[i] instanceof Roman) {
					tp +=liste[i].calculePrix();
				}
			}
			return tp;
		}
		
		
		
		
	
}
