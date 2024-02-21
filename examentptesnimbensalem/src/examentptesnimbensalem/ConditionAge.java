package examentptesnimbensalem;

public class ConditionAge implements ConditionAcces {
private int agemin;
ConditionAge(int agemin){
	this.agemin=agemin;
}

public int getAgemin() {
	return agemin;
}

public void setAgemin(int agemin) {
	this.agemin = agemin;
}

public boolean accesPossible(Personne p) {
	if(p.getAge()> agemin)
	{
		return true;
	}
	else {
		return false;
	}
}

}
