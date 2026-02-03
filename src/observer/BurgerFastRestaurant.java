package observer;

import java.util.ArrayList;

public class BurgerFastRestaurant {

    private static ArrayList<ClientVIP> clientVIPS = new ArrayList<>();

    public static void addClientVIP(ClientVIP clientVIP) {
        clientVIPS.add(clientVIP);
    }

    public static void notifyAllClientVIP(Promotion promotion) {
        for (ClientVIP clientVIP : clientVIPS) {
            clientVIP.receptionNotification(promotion);
        }
    }
}
