package ds19;

class Test {
	public static void main(String[] args) {
		Lettre l=new Lettre(5,"A4",true,"adresse");
		Colis c=new Colis(10,10,false,"adresse2");
		Courrier cou=new Courrier(true,"add");
		BoiteCourrier B= new BoiteCourrier(4);
		B.ajout(l);
		B.ajout(cou);
		B.ajout(c);
		B.affranchir();
		B.afficher();
		System.out.print("les courriers invalides sont "+B.courriersInvalide());		
	}
}
