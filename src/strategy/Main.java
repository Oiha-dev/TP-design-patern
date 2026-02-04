package strategy;

public class Main {

    public static void main(String[] args) {

        Commande c1 = new Commande(
                20.0,
                15.0,
                new LivraisonStandard()
        );

        Commande c2 = new Commande(
                20.0,
                5.0,
                new LivraisonExpress()
        );

        Commande c3 = new Commande(
                20.0,
                0.0,
                new ClickAndCollect()
        );

        System.out.println("Standard : " + c1.calculerTotal() + " €");
        System.out.println("Express  : " + c2.calculerTotal() + " €");
        System.out.println("Click&Collect : " + c3.calculerTotal() + " €");
    }
}
