package tp4;
public class Vehicule {
  private int num;
   private String marq;
   private int count;
   private String model;
   private int an;
   private double prix;
   vehicule(String marque, String modèle, int année, double prix)
   {
	   this.an=annee;
	   this.marq=marque;
	   this.model=modéle;
	   this.prix=prix;
   }
public String toString() {
	   return "le modéle de la voiture est : "+this.model+"\nla marque est : "+this.marq+"\n l'annee est : "+this.an+"\n son prix est :"+this.prix;
   }
   void decrisVehicule()
   {
	   toString();
   }
   public void setMarque(marque)
   {
	   this.marq=marque;
   }
   public void setPrix(prix)
   {
	   this.prix=prix;
   }
   public void setMarque(modele)
   {
	   this.model=modele;
   }
   String getMarque()
   {
	   return this.marq;
   }
   String getModele()
   {
	   return this.model;
   }
   double getPrix()
   {
	   return this.prix;
   }
   int getCount()
   {
	   return this.count;
   }
   int getAn()
   {
	   return this.an;
   }
   
   
}
