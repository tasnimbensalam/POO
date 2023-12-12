package exam2019;

public class Bureau extends Salle{
	private String[] enseignats;
	private int nbens=0;
public Bureau(int num, int nbPlaces, float surface, String departement, boolean connected,String[] enseignats) {
		super(num, nbPlaces, surface, departement, connected);
		this.enseignats=new String[5];
	}



@Override
void decrire() {
	System.out.println(this.getClass().getSimpleName()+super.toString()+"les nom des ensegnats:");
	for(int i=0;i<enseignats.length;i++) {
		System.out.println(enseignats[i]);
	}
	
}

void ajoutEnseignant(String nomEns) throws BureauPleinException {
	if(nbens<5) {
		this.enseignats[nbens]=nomEns;
		nbens++;
	}
	else {
		throw new BureauPleinException("plein");
	}
}

}
