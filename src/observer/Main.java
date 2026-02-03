package observer;

public class Main {

    public static void main(String[] args) {
        ClientVIP client1 = new ClientVIP("Alice");
        ClientVIP client2 = new ClientVIP("Bob");
        ClientVIP client3 = new ClientVIP("Charlie");
        ClientVIP client4 = new ClientVIP("Diana");

        BurgerFastRestaurant.addClientVIP(client1);
        BurgerFastRestaurant.addClientVIP(client2);
        BurgerFastRestaurant.addClientVIP(client3);
        BurgerFastRestaurant.addClientVIP(client4);

        Promotion promo = new Promotion(20);
        BurgerFastRestaurant.notifyAllClientVIP(promo);
    }
}
