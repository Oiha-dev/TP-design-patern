package observer;

public class ClientVIP {

    private String nom;

    public ClientVIP(String nom) {
        this.nom = nom;
    }

    public void receptionNotification(Promotion promotion) {
        System.out.println("Client VIP " + nom + " a reçu une notification de promotion avec un taux de remise de " + promotion.tauxRemise + "%.");
    }

}
