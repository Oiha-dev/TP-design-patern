package factory;

public class ChickenBurger implements Burger {
    @Override
    public String getRecette() {
        return "Chicken : pain burger, poulet pané croustillant, sauce BBQ";
    }

    @Override
    public int getPrix() {
        return 9;
    }
}
