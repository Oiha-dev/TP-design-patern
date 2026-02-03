package builder;

public class Sandwich {
    private final String pain;
    private final String viande;
    private final String fromage;
    private final String legumes;
    private final String sauce;
    private final Boolean grille;


    public Sandwich(SandwichBuilder builder) {
        this.pain = builder.pain;
        this.viande = builder.viande;
        this.fromage = builder.fromage;
        this.legumes = builder.legumes;
        this.sauce = builder.sauce;
        this.grille = builder.grille;
    }

    @Override
    public String toString() {
        String ingredients = "Sandwich sur " + pain;
        if (viande != null) ingredients += ", viande: " + viande;
        if (fromage != null) ingredients += ", fromage: " + fromage;
        if (legumes != null) ingredients += ", légumes: " + legumes;
        if (sauce != null) ingredients += ", sauce: " + sauce;
        if (grille != null && grille) ingredients += ", grillé";
        return ingredients;
    }
}
