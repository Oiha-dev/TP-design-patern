package strategy;

public class LivraisonExpress implements StrategieLivraison {

    @Override
    public double calculerFrais(double distanceKm, double prixPlats) {
        return 5.0 + (0.5 * distanceKm);
    }
}
