package examentptesnimbensalem;

public class Attraction {
private String nom;
private double cout;
private ConditionAge condition;
private int nbprs=0;
private double recette =0;
public Attraction(String nom, double cout, ConditionAge condition) {
	this.nom = nom;
	this.cout = cout;
	this.condition = condition;
	
}
@Override
public String toString() {
	return "Attraction [nom=" + nom + ", cout=" + cout + ", condition=" + condition.getAgemin() + ", nbprs=" + nbprs + ", recette="
			+ recette + "]";
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
void affiche() {
	System.out.println(this.toString());
}

void utilise (Personne p) throws AccesInterditException {
	
	if(condition.accesPossible(p)) {
		this.nbprs++;
		this.recette+= this.cout;
	}
	else {
		throw new AccesInterditException("l'age est interdite");
	}
}
public ConditionAge getCondition() {
	return condition;
}
public void setCondition(ConditionAge condition) {
	this.condition = condition;
}
public double getRecette() {
	return recette;
}
public void setRecette(double recette) {
	this.recette = recette;
}}

