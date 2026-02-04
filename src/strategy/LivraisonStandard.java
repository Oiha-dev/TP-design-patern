package strategy;

public class LivraisonStandard implements StrategieLivraison {

    @Override
    public double calculerFrais(double distanceKm, double prixPlats) {
        return 2.0 + (0.25 * distanceKm);
    }
}
