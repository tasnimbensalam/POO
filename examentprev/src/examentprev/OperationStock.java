package examentprev;

abstract public class OperationStock implements MouvementStock {
    private static int count;
	private int idOp;
	private Article art;
	public OperationStock(int idOp, Article art) {
		count++;
		this.idOp = count;
		this.art = art;
	}

@Override
public String toString() {
	return "OperationStock [idOp=" + idOp + ", art=" + art + "]";
}
public int getIdOp() {
	return idOp;
}
public void setIdOp(int idOp) {
	this.idOp = idOp;
}
public Article getArt() {
	return art;
}
public void setArt(Article art) {
	this.art = art;
}
	

}
