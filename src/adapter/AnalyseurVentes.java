package adapter;

import java.util.Map;

public interface AnalyseurVentes {
    float getTotalVentes();
    int getNbCommandes();
    Map<String, Double> getCAParProduit();
}
