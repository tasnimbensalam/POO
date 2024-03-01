package collections;
import java.util.HashMap;
import java.util.Map;
public class Annuaire {
	private Map<String, Fiche> table;

    public Annuaire() {
        this.table = new HashMap<>();
    }
    public void ajouterFiche(String nom, String numero, String adresse) {
        Fiche fiche = new Fiche(nom, numero, adresse);
        table.put(nom, fiche);
    }

    public Fiche chercherFiche(String nom) {
        return table.get(nom);
    }

    public void afficherFiches() {
        for (Fiche fiche : table.values()) {
            System.out.println(fiche);
        }
    }
}
