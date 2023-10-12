package tp4Encapsulation;

public class Test {

	public static void main(String[] args) {
		Vehicule v=new Vehicule ("clio","classique",20.000,2000);
		Vehicule w=new Vehicule("Mercedes","Fantome",60.000,2008);
		Vehicule x=new Vehicule("KIA","Picanto",35.000,2012);
		v.decrisVehicule();
		w.decrisVehicule();
		x.decrisVehicule();
		AgenceMobiliere tab= new AgenceMobiliere(4);
		tab.ajoutVehicule(v);
		tab.ajoutVehicule(w);
		tab.ajoutVehicule(x);
		System.out.println("\n case   :");
		tab.selection(2);
		System.out.println("\n MERCEDES  :");
		tab.selection("Mercedes");
		System.out.println("\nprix inf :");
		tab.selection(40.000);
		System.out.println("\n la plus ancienne  :");
		tab.ancienne();
		
	}

}
