package examentprev;


public class Vente extends OperationStock{
	private double prixVente;
	private int qteVendu;
	public Vente(int idOp, Article art,double prixVente,int qteVendu) throws QteArticleException{
		super(idOp, art);
		this.prixVente=prixVente;
		this.qteVendu=qteVendu;
		this.mouvementerStock(art, qteVendu);
	}
	@Override
	public boolean estMouvementabe() {
if(super.getArt().getQteStock()>=qteVendu) {
			return true;
		}
		else {
			return false;
		}
	}
	public double getPrixVente() {
		return prixVente;
	}
	public void setPrixVente(double prixVente) {
		this.prixVente = prixVente;
	}
	@Override
	public String toString() {
		return "Vente [prixVente=" + prixVente + ", qteVendu=" + qteVendu +  super.toString()+  "]";
	}
	@Override
	public void mouvementerStock(Article a, int qte) throws QteArticleException {
		if(estMouvementabe()) {
			super.getArt().setQteStock(super.getArt().getQteStock()-this.qteVendu);
		}
		else throw new QteArticleException(2);
		
	}
	
	
}
