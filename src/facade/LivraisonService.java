package facade;

public class LivraisonService {
    public static boolean disponibiliteLivreur(String adresse) {
        System.out.println("Vérification de la disponibilité du livreur pour l'adresse : " + adresse);
        return true;
    }

    public static boolean adressePerimetree(String adresse) {
        System.out.println("Vérification si l'adresse est dans le périmètre de livraison : " + adresse);
        return true;
    }
}
