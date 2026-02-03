package factory;

public class BurgerVeggie implements Burger {
    @Override
    public String getRecette() {
        return "Veggie : pain complet, salade, tomate, carotte";
    }

    @Override
    public int getPrix() {
        return 8;
    }
}
