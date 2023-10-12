package td3;

public class Test {

	public static void main(String[] args) {
		
		int nb=4;
		float noteCTRL[]=new float[nb];
		float noteExam[]=new float[5];
		float t3[]=new float[nb];
		float t4[]=new float[nb];
		float t[]=new float[nb];
		float tadd[]=new float[nb];
		
		
		Tab.remplir(noteCTRL);
		Tab.remplir(noteExam);
		System.out.println("\nnote de examen " );
		Tab.lister(noteExam);
		System.out.println("\nnote de ctrl :" );
		Tab.lister(noteCTRL);
		System.out.println("\nmoyenne de tout les etudiants :" );
		t4=Tab.produit(2, noteExam);
		
		t=Tab.additionner(noteCTRL,t4);
		//Tab.lister(t);
		t3=Tab.moyenne(t);
		Tab.lister(t3);
		float s=Tab.somme_element(t3);
		System.out.println("\n la moyenne de la classe est : "+s/nb);
		tadd=Tab.additionne(1.5, noteCTRL);
		System.out.println("\napres ajout :" );
		Tab.lister(tadd);
	}


}
