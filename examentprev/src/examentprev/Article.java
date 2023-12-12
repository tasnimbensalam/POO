package examentprev;

import java.util.Objects;

public class Article {
	private int code;
	private String libelle;
	private int qteStock ;
	private int stockMax;
	public Article(int code, String libelle, int qteStock, int stockMax) {
		super();
		this.code = code;
		this.libelle = libelle;
		this.qteStock = qteStock;
		this.stockMax = stockMax;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public int getQteStock() {
		return qteStock;
	}
	public void setQteStock(int qteStock) {
		this.qteStock = qteStock;
	}
	public int getStockMax() {
		return stockMax;
	}
	public void setStockMax(int stockMax) {
		this.stockMax = stockMax;
	}
	@Override
	public String toString() {
		return "Article [code=" + code + ", libelle=" + libelle + ", qteStock=" + qteStock + ", stockMax=" + stockMax
				+ "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(code, libelle);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Article other = (Article) obj;
		return code == other.code && Objects.equals(libelle, other.libelle);
	}
	

}
