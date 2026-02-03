package factory;

public class CheeseBurger implements Burger {
    @Override
    public String getRecette() {
        return "Cheeseburger : pain sesame, steak haché, cheddar fondu";
    }

    @Override
    public int getPrix() {
        return 10;
    }
}
