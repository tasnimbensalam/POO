package examentptesnimbensalem;

public class Main {

	public static void main(String[] args) {
		ParcAttraction p=new ParcAttraction("nom",10);
		ConditionAge c=new ConditionAge(18);
		Attraction a1=new Attraction("a1",14,c);
		ConditionAge c1=new ConditionAge(20);
		Attraction a2=new Attraction("att",14,c1);
		ConditionAge c2=new ConditionAge(35);
		Attraction a3=new Attraction("a1tt33",14,c2);
		p.ajouteAttraction(a3);
		p.ajouteAttraction(a2);
		p.ajouteAttraction(a1);
		Personne per=new Personne(15,105,"nom");
		Personne per1=new Personne(75,105,"nom2");
		Personne per2=new Personne(36,105,"nom3");
		try {
			a1.utilise(per2);
		}
		 catch (AccesInterditException e){
				 System.out.println(e.getMsg());
			 
		}
		try {
			a3.utilise(per1);
		}
		 catch (AccesInterditException e){
				 System.out.println(e.getMsg());
			 
		}
		try {
			a2.utilise(per);
		}
		 catch (AccesInterditException e){
				 System.out.println(e.getMsg());
			 
		}
		p.affiche();
		System.out.println("la recette globale : "+p.getRecette());
	}

}
