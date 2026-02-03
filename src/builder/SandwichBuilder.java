package builder;

public class SandwichBuilder {

    final String pain;

    String viande;
    String fromage;
    String legumes;
    String sauce;
    Boolean grille;

    public SandwichBuilder(String pain) {
        this.pain = pain;
    }

    public SandwichBuilder viande(String viande) {
        this.viande = viande;
        return this;
    }

    public SandwichBuilder fromage(String fromage) {
        this.fromage = fromage;
        return this;
    }

    public SandwichBuilder legumes(String legumes) {
        this.legumes = legumes;
        return this;
    }

    public SandwichBuilder sauce(String sauce) {
        this.sauce = sauce;
        return this;
    }

    public SandwichBuilder grille(Boolean grille) {
        this.grille = grille;
        return this;
    }

    public Sandwich build() {
        return new Sandwich(this);
    }

}
