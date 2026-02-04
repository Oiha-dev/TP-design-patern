package strategy;

public class Commande {

    private final double prixPlats;
    private final double distanceKm;
    private StrategieLivraison strategieLivraison;

    public Commande(double prixPlats, double distanceKm,
                    StrategieLivraison strategieLivraison) {
        this.prixPlats = prixPlats;
        this.distanceKm = distanceKm;
        this.strategieLivraison = strategieLivraison;
    }

    public double calculerFraisLivraison() {
        return strategieLivraison.calculerFrais(distanceKm, prixPlats);
    }

    public double calculerTotal() {
        return prixPlats + calculerFraisLivraison();
    }
}
