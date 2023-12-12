package examentprev;

public class Achat extends OperationStock {
	private int prixAchat;
	private int qtiteachete;
	public Achat(int idOp, Article art,int prixAchat,int qtiteachete) throws QteArticleException{
		super(idOp, art);
		this.prixAchat=prixAchat;
		this.qtiteachete=qtiteachete;
		mouvementerStock(art,qtiteachete);
	}
	
	@Override
	public String toString() {
		return "Achat [prixAchat=" + prixAchat + ", qtiteachete=" + qtiteachete + super.toString()+ "]";
	}

	@Override
	public boolean estMouvementabe() {
		if(qtiteachete+super.getArt().getQteStock()<=super.getArt().getStockMax()) {
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	public void mouvementerStock(Article a, int qte) throws QteArticleException {
		if(estMouvementabe()) {
			super.getArt().setQteStock(super.getArt().getQteStock()+this.qtiteachete);
		
		}
		else throw new QteArticleException(1);
	

	}}
