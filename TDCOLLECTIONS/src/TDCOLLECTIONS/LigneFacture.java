package TDCOLLECTIONS;

public class LigneFacture {
	private int id;
	private int qt;
	private Article article;
	public LigneFacture(int id, Article article, int qt) {
	super();
	this.id = id;
	this.qt = qt;
	this.article = article;
	}
	public Article getArticle() { return article; }
	public void setArticle(Article article) {
	this.article = article; }
	public int getQt() { return qt; }
	public void setQt(int qt) { this.qt = qt; }
	public int getId() { return id; }
	public void setId(int id) { this.id = id; }
	public double getMontantTotal() {
		
		return article.getPU() * qt ;
	}
	}

