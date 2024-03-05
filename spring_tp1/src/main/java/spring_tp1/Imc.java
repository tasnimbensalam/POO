package spring_tp1;


public class Imc {
   double poids;
   double taille;
   double imc;
   public Imc(double taille, double poids) {
	   this.poids=poids;
	   this.taille=taille;}
   public Imc(double taille, double poids, double c) {
	   this.poids=poids;
	   this.taille=taille;
	   this.imc=c;
   }
   double calcul() {
	   return poids/(taille*taille);
   }
public double getPoids() {
	return poids;
}
public double getTaille() {
	return taille;
}
public double getImc() {
	return poids/(taille*taille);
}
}

