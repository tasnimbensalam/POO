package exam2019;

public class SalleCours extends Salle{
	private boolean videoProj;
public SalleCours(int num, int nbPlaces, float surface, String departement, boolean connected, boolean videoProj) {
		super(num, nbPlaces, surface, departement, connected);
		this.videoProj=videoProj;
	}






public boolean isVideoProj() {
	return videoProj;
}







@Override

	void decrire() {
		System.out.println(this.getClass().getSimpleName()+super.toString()+"les nom des ensegnats:");
		if(this.videoProj) {
			System.out.println("il ya un projecteur");
		}
		else {
			System.out.println("sans proj");
		}
		
	
	
}

}
