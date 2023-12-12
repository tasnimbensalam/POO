package examentprev;

public class QteArticleException extends Exception {
int choix;
QteArticleException(int choix){
	if(choix==1) {
		System.out.println( "L'espace de stockage est insuffisant.");
		
	}
	else {
		System.out.println( "La quantite de stockage est insuffisant.");
	}
}
public int getChoix() {
	return choix;
}

public void setChoix(int choix) {
	this.choix = choix;
}

}
