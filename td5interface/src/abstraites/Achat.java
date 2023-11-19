package abstraites;

class Achat {

	static Article[] supermarche=new Article[4];
	public static void main(String args[] ) {
		Vetement v=new Vetement(123,"jupe bleue taille s",39,2);
		ProduitElec p=new ProduitElec(145,"TV led 80 cm",1450,0);
		Vetement vv=new Vetement(191,"Pantalon noir taille M",42,5);
		ProduitGC p1=new ProduitGC(191,"Pates",0.41,18);
		supermarche[0]=v;
		supermarche[1]=p;
		supermarche[2]=vv;
		supermarche[3]=p1;
	
	void acheter(int i,int qte) {
		if(supermarche[i].estDispo(qte)) {
			supermarche[i].approvisionner(qte);
	            System.out.println("Achat réussi : ");
	            supermarche[i].decrire();
	            double prixTotal = supermarche[i].calculPrixTTC() * qte;
			if( supermarche[i] instanceof Promotion) {
				
				(Promotion)supermarche[i].
			}
				}
		}
	
			
}
}