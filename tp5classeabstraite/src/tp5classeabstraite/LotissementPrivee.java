package tp5classeabstraite;

class LotissementPrivee extends Lotissement  {

	public LotissementPrivee(int capacite) {
		super(capacite);
	}
	
	@Override()
	public boolean ajouter(Propriete p){
		if( p.getClass().getSimpleName().equals("ProprietePrivee")){
			super.ajouter(p);
		}
		return false;
		
	}
	 public ProprietePrivee getproprieteByIndice (int i) {
		 if( super.tabProp[i].getClass().getSimpleName().equals("ProprietePrivee")) {
			 return ((ProprietePrivee) super.getpropriétéByIndice(i));
			 
		 }
		 else { return null;}
		
	 }
	 Lotissement lt= new LotissementPrivee(10);
	 

}
