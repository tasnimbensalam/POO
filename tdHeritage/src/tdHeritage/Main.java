package tdHeritage;

class Main {
	public static void main(String[] args) {
		Librairie l=new Librairie(4);
		Livre liv=new Livre(4,"livre",100,"drama");
		Roman rom=new Roman(3,"roman",500,"action","Salah","Ali");
		Magazine mag=new Magazine(1,"magazine",20,"fashion",10);
		l.ajoutLiv(liv);
		l.ajoutLiv(rom);
		l.ajoutLiv(mag);
		
        l.inventaire();
        
		System.out.println("****************");
		Roman rom2=new Roman(0,"tesnim",300,"comedy","tesnim","tesnim");
		l.ajoutLiv(rom2);
		
		l.inventaire("Roman");
		System.out.println("le totalprix des romans est :  "+l.montant());
	}

	
}
