package tp5classeabstraite;

public class Lotissement implements GestionPropriete {
	protected Propriete [] tabProp;
	protected int nombre;
	 Lotissement(int capacite) {
		 this.nombre=0;
		 if(max_proprietes>=capacite)
		 {tabProp=new Propriete[capacite];}
	 }
	 Propriete getpropriétéByIndice (int i) {
		 if(i>0 && i<=nombre)
		{return tabProp[i];}
		 return null;
		 
	 }
	 int getnbPieces() {
		 int s=0;  
		 for(int i=0;i<nombre;i++) { 
			 if((tabProp[i] instanceof ProprietePrivee)) {
				 s=s+((ProprietePrivee)tabProp[i]).getnbPiece();
			 }
		 }
		return s;
	 }
	@Override
	public void afficherProprietes() {
		
		for(int i=0;i<nombre;i++) {
		System.out.println(tabProp[i].toString()+"************");
		}
	}
	@Override
	public boolean ajouter(Propriete p) {
		if(this.nombre <this.tabProp.length) {
			tabProp[nombre]=p;
			nombre++;
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	public boolean supprimer(Propriete p) {
		for(int i=0;i<nombre;i++) {
			if(tabProp[i].equals(p)) {
				for(int j=i+1;j<nombre;j++)
				{tabProp[i]=tabProp[j];}
				return true;
			}
		}
		return false;
	}

}
