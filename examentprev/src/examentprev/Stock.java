package examentprev;

public class Stock {
OperationStock[] tabOp;
int nbOp=0;
public Stock(int max) {
	this.tabOp = new OperationStock[max];
	
}
void ajouterOp(OperationStock o) {
	if(nbOp<tabOp.length) {
		tabOp[nbOp]=o;
		nbOp++;
	}
	else {
		System.out.println("insuffisant gsdyh");
	}
}
void affichOpAchat() {
	for(int i=0;i<nbOp;i++) {
		System.out.println(tabOp[i].toString());
	}
}
double meilleurPrixVente(Article a) {
	double min=0;
	int i;
	for(i=0;i<nbOp;i++) {
		if(tabOp[i] instanceof Vente && a.equals(tabOp[i])) 
		{min=((Vente)tabOp[i]).getPrixVente();
		break;
		}
		}
	for(i=i+1;i<nbOp;i++) {
		if(tabOp[i] instanceof Vente) {
			if(a.equals(tabOp[i])) {
				if(min>((Vente)tabOp[i]).getPrixVente())
				{
					min=((Vente)tabOp[i]).getPrixVente();
				}
			}
		}
	}
	return min;
}
}
