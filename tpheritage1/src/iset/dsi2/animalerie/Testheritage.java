package iset.dsi2.animalerie;


class Testheritage {
	public static void main(String[] args) {
		Animal[] T=new Animal[3];
		Animal obj=new Animal("noir",50);
		Chat ob2=new Chat(true,"noir",10);
		Chien ob3=new Chien("berger","marron",20);
		T[0]=obj;
		T[1]=ob2;
		T[2]=ob3;
		for(Animal animal : T) {
			
				animal.decrisToi();
	    		animal.boire();
	    		animal.crier();
	    		animal.manger();
	    		//if(animal instanceof Animal) makhdmtch 
				if(animal.getClass()== Animal.class) {
					System.out.println("l'espece est inconnue");
				}
			
			
			
		}
	}
}
