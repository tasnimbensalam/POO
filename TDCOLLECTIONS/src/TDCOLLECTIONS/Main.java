package TDCOLLECTIONS;

public class Main {

	public static void main(String[] args) {
        Article article1 = new Article("mrticle1", 10);
        Article article2 = new Article("brticle2", 20);
        Article article3 = new Article("crticle3", 100);
        Article article4 = new Article("drticle4", 15);
     
        Stock stock = new Stock();

       
        stock.addNouvArticle(article1, 50);
        stock.addNouvArticle(article2, 30);
        stock.addNouvArticle(article3, 70);
        stock.addNouvArticle(article4, 800);

     
        System.out.println("Stock avant vente :");
        stock.sortStock();

     
        Facture facture = new Facture(stock);

       
        facture.addLigne(2, "mrticle1");
        facture.addLigne(3, "brticle2");
        facture.addLigne(4, "crticle3");
        facture.addLigne(5, "drticle4");

        System.out.println("Montant total de la facture : " + facture.getMontantTotal());

        
        facture.removeLigne(1);

        
        System.out.println("Stock après vente :");
        stock.sortStock();
    }


   
    	
    

	

}
