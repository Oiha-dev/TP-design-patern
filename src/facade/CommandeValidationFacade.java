package facade;

public class CommandeValidationFacade {
    public static void validerCommande(String username, String recette, String adresseLivraison) {
        UserService.connexionUser(username);
        boolean ingredientsDisponibles = RecetteService.disponibiliteIngredients(recette);
        boolean tempsPreparationOk = PreparationService.tempsPreparation(recette);
        boolean livraisonOk = LivraisonService.disponibiliteLivreur(adresseLivraison);
        boolean adresseOk = LivraisonService.adressePerimetree(adresseLivraison);

        if (ingredientsDisponibles && tempsPreparationOk && livraisonOk && adresseOk) {
            System.out.println("Commande validée pour " + recette + " de " + username + ".");
        } else {
            System.out.println("Commande non validée pour " + recette + "de" + username + ".");
        }
    }
}
