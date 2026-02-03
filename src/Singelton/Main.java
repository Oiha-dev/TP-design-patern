package Singelton;

public class Main {

    public static void main(String[] args) {
        TPE tpe = TPE.getInstance();
        tpe.ajouterPaiement(50.0);
        System.out.println("Solde : " + tpe.getSolde());

        TPE tpe2 = TPE.getInstance();
        tpe2.ajouterPaiement(30.0);
        System.out.println("Solde : " + tpe.getSolde());

        TPE tpe3 = TPE.getInstance();
        System.out.println("Solde : " + tpe3.getSolde());

    }

}
