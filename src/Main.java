import builder.Sandwich;
import builder.SandwichBuilder;

public class Main {
    public static void main(String[] args) {
        Sandwich sandwich1 = new SandwichBuilder("baguette")
                .viande("poulet")
                .fromage("cheddar")
                .legumes("laitue")
                .sauce("mayo")
                .grille(true)
                .build();

        System.out.println(sandwich1);

        Sandwich sandwich2 = new SandwichBuilder("ciabatta")
                .viande("rosbif")
                .fromage("emmental")
                .legumes("oignon")
                .sauce("ketchup")
                .grille(false)
                .build();

        System.out.println(sandwich2);

        Sandwich sandwich3 = new SandwichBuilder("complet")
                .viande("jambon")
                .fromage("cheddar")
                .legumes("cornichon")
                .sauce("moutarde")
                .grille(true)
                .build();

        System.out.println(sandwich3);
    }
}