package facade;


public class Main {
    public static void main(String[] args) {
        String username = "Géraldine";
        String recette = "Cheeseburger";
        String adresseLivraison = "2 rue place de l'Europe";

        CommandeValidationFacade.validerCommande(username, recette, adresseLivraison);
    }
}