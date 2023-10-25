package ds19;

class BoiteCourrier {
		private Courrier[] tab;
		private int nb=0;
		BoiteCourrier(int n){
			
			this.tab=new Courrier[n];
		}
		void ajout(Courrier c) {
			if(nb<this.tab.length)
			{
				tab[nb]=c;
				nb=nb+1;
			}
		}
		
		public double affranchir() {
			double s=0;
			for(int i=0;i<nb;i++) 
				{s+=tab[i].affranchir();}
			
			return s;
		}
		public int courriersInvalide() {
			int inv=0;
			for(int i=0;i<nb;i++) {
			  if(tab[i].estValide()==false) {
				  inv+=1;
			  }
			}
			return inv;
		}
		public void afficher() {
			for(int i=0;i<nb;i++) {
				if(tab[i].estValide()) {
					tab[i].decrire();
				}
				else
				{
					System.out.println("\n n'est pas valide : \n");
					tab[i].decrire();
				}
			}
		}
		
		
}
