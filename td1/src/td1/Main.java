package td1;

public class Main {
	public static void main(String[] args) {
	  Livre[] livres=new Livre[3];
	  livres[0] = new Livre("L'alchimiste", "Coelho", 225);
      livres[1] = new Livre("Le Coran", "Unknown", 508);
      livres[2] = new Livre("Harry Potter", "JK Rowling");
      for (int i = 0; i < livres.length; i++) {
          System.out.println("Livre " + (i + 1) + ": " + livres[i]);
      }

      livres[1].setauteur("Paulo Coelho");
      livres[2].setnbpages(461);
      System.out.println("\nDescription de tous les livres :");
      for (int i = 0; i < 3; i++) {
    	    livres[i].decrire();
    	}

	}

}
