package factory;

public class Main {
    public static void main(String[] args) {
        Burger veggie = BurgerFactory.create(BurgerType.VEGGIE);
        System.out.println(veggie.getRecette() + " | Prix : " + veggie.getPrix() + "€");

        Burger cheeseburger = BurgerFactory.create(BurgerType.CHEESEBURGER);
        System.out.println(cheeseburger.getRecette() + " | Prix : " + cheeseburger.getPrix() + "€");

        Burger chicken = BurgerFactory.create(BurgerType.CHICKEN);
        System.out.println(chicken.getRecette() + " | Prix : " + chicken.getPrix() + "€");
    }
}
