package poo2022;

public class Main {

	public static void main(String[] args) {
		BoutiqueInfo boutique=new BoutiqueInfo();
		 String[] connexion1 = {"4usb", "ble", "wifi"};
		 String[] connexion2= {"4usb", "ble","hdmi", "wifi"};
		 MaterielInfo m = new Ordinateur(1, 1800, 4, "DELL", "Intel i3 2.5", connexion1);
		 MaterielInfo m1 = new Ordinateur(2, 2000, 7, "HP", "Intel i5 4", connexion2);
		boutique.ajoutMateriel(m);	
		
		boutique.ajoutMateriel(m1);
		boutique.affichboutiq();
		System.out.println(m1.prixVente()+" "+m.prixVente());
		try {
			boutique.venteMateriel(1, 4);
			boutique.affichboutiq();
		} catch (ExceptionQte e) {
			
			System.out.println(e.getMessage());
		}
		try {
			boutique.venteMateriel(1, 8);
		} catch (ExceptionQte e) {
			
			System.out.println(e.getMessage());
		}
	
	
	
	
	}

}
