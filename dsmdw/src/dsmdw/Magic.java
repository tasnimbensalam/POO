package dsmdw;

class Magic {
public static void main(String[] args) {
	Jeu maMain = new Jeu(10);
	Terrains t = new Terrains('B');
	 maMain.ajouter(t);
	 Creature c =new Creature(6.0, " Gobelin", 4, 6);
	 maMain.ajouter(c);
	 Sortilege s=new Sortilege(1.0, "Amplificatum","Il augmente la taille de l'objet ou de l'animal visé");
	 maMain.ajouter(s);
	 System.out.println("*******[idha bch t3ayt methode ou attribut fl clss fille casting ]Là, j'ai en stock :");
	 maMain.afficher();
	 maMain.jouer();
	 maMain.jouer();
	 
}}
