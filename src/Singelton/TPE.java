package Singelton;

public class TPE {
    private static TPE instance;
    private double solde;

    private TPE() {
        this.solde = 0.0;
    }

    public static TPE getInstance() {
        if (instance == null) {
            instance = new TPE();
        }
        return instance;
    }

    public void ajouterPaiement(double montant) {
        this.solde += montant;
    }

    public double getSolde() {
        return this.solde;
    }

    public void resetSolde() {
        this.solde = 0.0;
    }
}
