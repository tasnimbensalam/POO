package tp4Encapsulation;
public class Vehicule {
  private int num;
   private String marq;
   private int count;
   private String model;
   private int an;
   private double prix;

   Vehicule(String marque, String modèle,  double prix,int année)
   {
	   this.an=année;
	   this.marq=marque;
	   this.model=modèle; 
	   this.prix=prix;
   }
public String toString() {
	   return "le modéle de la voiture est : "+this.model+"\nla marque est : "+this.marq+"\n l'annee est : "+this.an+"\n son prix est :"+this.prix+"\n------";
   }
   void decrisVehicule()
   {
	   System.out.println(this);
   }
   public void setMarque(String marque)
   {
	   this.marq=marque;
   }
   public void setPrix(double prix)
   {
	   this.prix=prix;
   }
   public void setModel(String modele)
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
