package ds2022;

class JeuPrincipal {
	public static void main(String[] args) {
		Editeur ed1=new Editeur(123, "Ubisoft", "Canada");
		Editeur ed2=new Editeur(133, "Vivendi Universal", "France");
		Jeu[] tab=new Jeu[3];
		Jeu j1=new Jeu("Watch dogs", 2020, 6, ed1);
		Jeu j2=new Jeu ("WoW", 2019, 12, ed2);
		JeuMulti j3=new JeuMulti("WoW", 2018, 12, ed2, 2);
		tab[0]=j1;
		tab[1]=j2;
		tab[2]=j3;
		for(int i=0;i<3;i++) {
			
				tab[i].decrire();
			
		}
		for(int i=0;i<3;i++) {
			if("Vivendi Universal".equals(tab[i].getEditeru())) {
				tab[i].decrire();
			}
		}
		int s=0;
		for(Jeu j :tab) {
			
			if(j instanceof JeuMulti) {
				s+=((JeuMulti)j).getNbrj();//CASTINGGGGG
				
			}
			
			
		}
		
		System.out.println("\n nbr de joueur multi est "+s);
	}
}
