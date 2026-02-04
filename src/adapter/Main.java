package adapter;

public class Main {

    public static void main(String[] args) {

        LecteurCSV lecteur = new LecteurCSV("src/adapter/ventes.csv");
        AnalyseurVentes analyseur = new CSVAdapter(lecteur);

        BurgerAnalytics analytics = new BurgerAnalytics(analyseur);
        analytics.genererRapport();
    }
}
