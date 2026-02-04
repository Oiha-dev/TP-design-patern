package adapter;

import java.util.HashMap;
import java.util.Map;

public class CSVAdapter implements AnalyseurVentes {

    private final LecteurCSV lecteur;

    public CSVAdapter(LecteurCSV lecteur) {
        this.lecteur = lecteur;
    }

    @Override
    public float getTotalVentes() {
        float total = 0;

        for (int i = 1; i < lecteur.getNbLignes(); i++) {
            String[] colonnes = lecteur.getColonnes(i);
            String[] prixQuantite = colonnes[2].split("x");

            float prix = Float.parseFloat(prixQuantite[0].trim());
            int quantite = Integer.parseInt(prixQuantite[1].trim());

            total += prix * quantite;
        }

        return total;
    }


    @Override
    public int getNbCommandes() {
        return lecteur.getNbLignes() - 1;
    }

    @Override
    public Map<String, Double> getCAParProduit() {
        Map<String, Double> caParProduit = new HashMap<>();

        for (int i = 1; i < lecteur.getNbLignes(); i++) {
            String[] colonnes = lecteur.getColonnes(i);
            String produit = colonnes[1];

            String[] prixQuantite = colonnes[2].split("x");
            double prix = Double.parseDouble(prixQuantite[0].trim());
            int quantite = Integer.parseInt(prixQuantite[1].trim());

            double ca = prix * quantite;
            caParProduit.merge(produit, ca, Double::sum);
        }

        return caParProduit;
    }
}
